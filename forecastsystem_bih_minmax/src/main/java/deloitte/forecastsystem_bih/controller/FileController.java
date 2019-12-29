package deloitte.forecastsystem_bih.controller;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import deloitte.forecastsystem_bih.commandcenter.CommandCenter;
import deloitte.forecastsystem_bih.filestorage.CheckUploadService;
import deloitte.forecastsystem_bih.filestorage.CopyDataStatusEnum;
import deloitte.forecastsystem_bih.filestorage.CopyUploadToDbService;
import deloitte.forecastsystem_bih.filestorage.FileStorageService;
import deloitte.forecastsystem_bih.filestorage.ProcessingStatusEnum;
import deloitte.forecastsystem_bih.filestorage.UploadStatusEnum;
import deloitte.forecastsystem_bih.model.FileUploadTable;
import deloitte.forecastsystem_bih.service.FileUploadTableService;

import java.nio.file.Files;
import java.util.Calendar;
import java.util.Date;


@RestController
@RequestMapping("/upload")
public class FileController {
	
	@Autowired
	FileStorageService fileStorageService;
	
	@Autowired
	CheckUploadService checkUploadService;
	
	@Autowired
	CopyUploadToDbService copyUploadToDbService;
	
	@Autowired
	CommandCenter commandCenter;	
	
	@Autowired
	FileUploadTableService fileUploadTableService;
	
    @PostMapping("/uploadDailyLoad")
    public @ResponseBody Object uploadFile(@RequestParam("username") String username, @RequestParam("file") MultipartFile file) {
    	
    	System.out.println("Username: " + username);
    	System.out.println("File: " + file.getName());
    	System.out.println("Size: " + file.getSize());
    	System.out.println("File name original: " + file.getOriginalFilename());
    	
    	fileStorageService.storeFile(file);
    	
    	System.out.println("-------------------");
		Calendar cLoadDateYesterday = Calendar.getInstance();		
		cLoadDateYesterday.set(Calendar.HOUR_OF_DAY, 0);
		cLoadDateYesterday.set(Calendar.MINUTE, 0);
		cLoadDateYesterday.set(Calendar.SECOND, 0);
		cLoadDateYesterday.set(Calendar.MILLISECOND, 0);	 
		cLoadDateYesterday.add(Calendar.DAY_OF_MONTH, -1);
		//cLoadDateYesterday.set(year, month, date, hourOfDay, minute, second);
    	
		System.out.println("Loading values for: " + cLoadDateYesterday.getTime());
		
    	checkUploadService.setFilename(file.getOriginalFilename());
    	checkUploadService.setLoadDate(cLoadDateYesterday.getTime());
    	UploadStatusEnum uploadStatus = checkUploadService.getStatus(); 
    	CopyDataStatusEnum copyStatus = CopyDataStatusEnum.CDS_WAITHING; 
    	if (uploadStatus == UploadStatusEnum.US_FILE_OK) {
    		System.out.println("File is OK...");    		
    		// coping file to DB    		
    		copyUploadToDbService.setFilename(file.getOriginalFilename());
    		copyUploadToDbService.setLoadDate(cLoadDateYesterday.getTime()); 
    		if (copyUploadToDbService.copyFileToDb()) {
    			System.out.println("File is copied to db...");
    			copyStatus = CopyDataStatusEnum.CDS_OK;
    		} else {
    			System.out.println("File is not copied to db...");
    			copyStatus = CopyDataStatusEnum.CDS_ERROR;
    		}
    		
    		// processing data
    		ProcessingStatusEnum result = ProcessingStatusEnum.PS_WAIT_FOR_PROCESSING;
    		
    		if (commandCenter.runWeatherHistoryService()) {    			
    			// Ok, next
    			if (commandCenter.runWeatherForecastService()) {
    				// Ok, next
    				
        			if (commandCenter.runPreparePartialInputDataHourlyStart()) {
        				// Ok, next

            			if (commandCenter.runPartialArimaService()) {
            				// Ok, next

                			if (commandCenter.runPartialSimilarDayService()) {
                				// Ok, next

                    			if (commandCenter.runPreparePartialInputDataHourlyComplete()) {
                    				// Ok, next
                    				
                        			if (commandCenter.runArimaForecastService()) {
                        				// Ok, next
                        				
                            			if (commandCenter.runSimilarDayTodayService()) {
                            				// Ok, next
                            				
                                			if (commandCenter.runLoadForecastTodayService()) {
                                				// Ok, next
                                				
                                    			if (commandCenter.runSimilarDayTomorrowService()) {
                                    				// Ok, next
                                    				
                                        			if (commandCenter.runLoadForecastTomorrowService()) {
                                        				// Ok, next
                                        				result = ProcessingStatusEnum.PS_OK;
                                        			} else {
                                        				result = ProcessingStatusEnum.PS_ERROR_LF_TOMORROW;
                                        			}                                    				
                                    				
                                    			} else {
                                    				result = ProcessingStatusEnum.PS_ERROR_SD_TOMORROW;
                                    			}                                				
                                				
                                			} else {
                                				result = ProcessingStatusEnum.PS_ERROR_LF_TODAY;
                                			}                            				
                            				
                            			} else {
                            				result = ProcessingStatusEnum.PS_ERROR_SD_TODAY;
                            			}                          				
                        				
                        			} else {
                        				result = ProcessingStatusEnum.PS_ERROR_ARIMA_FORECAST;
                        			}                    				
                    				
                    			} else {
                    				result = ProcessingStatusEnum.PS_ERROR_COMPLETING;
                    			}                				
                				
                			} else {
                				result = ProcessingStatusEnum.PS_ERROR_PARTIAL_SD;
                			}        				            				
            				
            			} else {
            				result = ProcessingStatusEnum.PS_ERROR_PARTIAL_ARIMA;
            			}        				
        				
        			} else {
        				result = ProcessingStatusEnum.PS_ERROR_PREPARING;
        			}    				
    				
    			} else {
    				result = ProcessingStatusEnum.PS_ERROR_WEATHER_FORECAST;
    			}
    		} else {
    			result = ProcessingStatusEnum.PS_ERROR_WATHER_HISTORY;
    		}
    		
    		//update file upload
    		FileUploadTable fut = new FileUploadTable();
    		
    		fut.setId(0L);
    		fut.setFilename(file.getOriginalFilename());
    		fut.setFileLoadDate(cLoadDateYesterday.getTime());
    		fut.setUploadDatetime(new DateTime());
    		fut.setFileStatus(uploadStatus.value);
    		fut.setFileProcessingStatus(result.value);
    		fut.setUsername(username); 
    		fut.setFileCopyStatus(copyStatus.value);
    		
    		//fileUploadTableService.save(fut);
    		
    	} else {
    		System.out.println("Error : " + uploadStatus); 
    	}
    	
    	System.out.println("-------- END ------");
    	
    	return ResponseEntity.status(HttpStatus.OK).body("");
    }

}
