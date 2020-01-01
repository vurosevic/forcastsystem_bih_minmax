package deloitte.forecastsystem_bih.filestorage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;

import org.apache.commons.io.FilenameUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("checkUploadService")
public class CheckUploadService {
	
	@Autowired
	FileStorageProperties fileStorageProperties; 
	
	String filename;
	Date loadDate;
	String fullPath;
	
	public CheckUploadService() {
		// TODO Auto-generated constructor stub
	}
	
	public CheckUploadService(String filename, Date loadDate) {
		// TODO Auto-generated constructor stub
		this.filename = filename;
		this.fullPath = fileStorageProperties.getUploadDir() + "/" + filename;
		this.loadDate = loadDate;
	}
	
	public Boolean checkFileType() {
		Boolean res = Boolean.FALSE;
		
		String ext = FilenameUtils.getExtension(this.filename);
		String lext = "xlsx";
		
		if (ext.equals(lext)) res = Boolean.TRUE;
		else res = Boolean.FALSE;
		
		return res;
	}
	
	public Boolean checkRows() {
		Boolean res = Boolean.FALSE;
		
		try {
        FileInputStream excelFile = new FileInputStream(new File(this.fullPath));
        Workbook workbook = new XSSFWorkbook(excelFile);
        Sheet datatypeSheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = datatypeSheet.iterator();
        
        int count = 0;
        while (iterator.hasNext()) {
        	count++;
        	iterator.next();
        	if (count>26) break;
        }
        
        if (excelFile != null) excelFile.close();
        
        if (count<26) res = Boolean.FALSE;
        else res = Boolean.TRUE;
        
		} catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }		
		
		return res;
	}
	
	public Boolean checkDate() {
		Boolean res = Boolean.TRUE;
		
		try {
        FileInputStream excelFile = new FileInputStream(new File(this.fullPath));
        Workbook workbook = new XSSFWorkbook(excelFile);
        Sheet datatypeSheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = datatypeSheet.iterator();
        
        for (int i=2; i<24; i++) {
        	if (!datatypeSheet.getRow(i).getCell(0).getDateCellValue().equals(this.loadDate))
        		res = Boolean.FALSE;
        		break;
        }       
        
        if (excelFile != null) excelFile.close();
        
		} catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }		
				
		return res;
	}	
	
	public Boolean checkHours() {
		Boolean res = Boolean.TRUE;
		
		try {
        FileInputStream excelFile = new FileInputStream(new File(this.fullPath));
        Workbook workbook = new XSSFWorkbook(excelFile);
        Sheet datatypeSheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = datatypeSheet.iterator();
        
        for (int i=2; i<26; i++) {
        	if (datatypeSheet.getRow(i).getCell(1).getNumericCellValue()!=(i-1)) {
        		res = Boolean.FALSE;
        		break;
        	}
        }      
        
        if (excelFile != null) excelFile.close();
        
		} catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }		
				
		return res;
	}	
	
	public Boolean checkLoadValues() {
		Boolean res = Boolean.TRUE;
		
		try {
        FileInputStream excelFile = new FileInputStream(new File(this.fullPath));
        Workbook workbook = new XSSFWorkbook(excelFile);
        Sheet datatypeSheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = datatypeSheet.iterator();
        
        for (int i=2; i<24; i++) {
        	if (datatypeSheet.getRow(i).getCell(3).getNumericCellValue()<0) {
        		res = Boolean.FALSE;
        		break;
        	}
        	if (datatypeSheet.getRow(i).getCell(3).getNumericCellValue()>2000) {
        		res = Boolean.FALSE;
        		break;
        	}        	
        }        
        
        if (excelFile != null) excelFile.close();
        
		} catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }		
					
		return res;
	}	
	
	public UploadStatusEnum getStatus() {
		UploadStatusEnum res = UploadStatusEnum.US_FILE_OK;
		if (!checkFileType()) res = UploadStatusEnum.US_ERROR_FILE_TYPE;
		else if (!checkRows()) res = UploadStatusEnum.US_ERROR_ROWS;
		else if (!checkDate()) res = UploadStatusEnum.US_ERROR_DATE;
		else if (!checkHours()) res = UploadStatusEnum.US_ERROR_HOURS;
		else if (!checkLoadValues()) res = UploadStatusEnum.US_ERROR_LOAD_VALUE;		
		return res;
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
	
	

}
