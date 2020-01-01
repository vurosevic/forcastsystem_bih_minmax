package deloitte.forecastsystem_bih.filestorage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import deloitte.forecastsystem_bih.model.Load;
import deloitte.forecastsystem_bih.service.CountryService;
import deloitte.forecastsystem_bih.service.LoadService;

@Service("copyUploadToDbService")
public class CopyUploadToDbService {
	
	@Autowired
	FileStorageProperties fileStorageProperties; 
	
	@Autowired
	CountryService countryService; 
	
	@Autowired
	LoadService loadService;
	
	String filename;
	Date loadDate;
	String fullPath;
	
	public CopyUploadToDbService() {
		// TODO Auto-generated constructor stub
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
		this.fullPath = fileStorageProperties.getUploadDir() + "/" + filename;
	}

	public Date getLoadDate() {
		return loadDate;
	}

	public void setLoadDate(Date loadDate) {
		this.loadDate = loadDate;
	}

	public String getFullPath() {
		return fullPath;
	}

	public void setFullPath(String fullPath) {
		this.fullPath = fullPath;
	}
	
	public Boolean copyFileToDb() {
		Boolean res = Boolean.FALSE;
		
		try {
	        FileInputStream excelFile = new FileInputStream(new File(this.fullPath));
	        Workbook workbook = new XSSFWorkbook(excelFile);
	        Sheet datatypeSheet = workbook.getSheetAt(0);
	        //Iterator<Row> iterator = datatypeSheet.iterator();
	        
	        for (int i=2; i<26; i++) {
	        	
	        	Load loadYesterday = new Load();
	        	
	        	loadYesterday.setId(0L);
	        	loadYesterday.setCountry(countryService.findById(2L)); //BIH 
	        	loadYesterday.setLoadDate(datatypeSheet.getRow(i).getCell(0).getDateCellValue()); 
	        	loadYesterday.setLoadHour(Integer.valueOf((int) datatypeSheet.getRow(i).getCell(1).getNumericCellValue())-1);
	        	loadYesterday.setLoadMinute(Integer.valueOf((int) datatypeSheet.getRow(i).getCell(2).getNumericCellValue()));
	        	loadYesterday.setLoadForecatEntsoe(0);
	        	loadYesterday.setLoadRealData((int)(Math.round(datatypeSheet.getRow(i).getCell(3).getNumericCellValue())));	        	

	        	//check if exist loadYesterday in db.
	        	// if not then ...
	        	
	        	loadService.save(loadYesterday);	
	        	res = Boolean.TRUE;
	        	
	        }
	        
	        if (excelFile != null) excelFile.close();
	        
			} catch (FileNotFoundException e) {
				res = Boolean.FALSE;
	            e.printStackTrace();
	        } catch (IOException e) {
	        	res = Boolean.FALSE;
	            e.printStackTrace();
	        }		
		
		return res;
		
	}

}
