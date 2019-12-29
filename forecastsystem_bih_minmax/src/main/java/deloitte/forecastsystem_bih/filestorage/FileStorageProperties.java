package deloitte.forecastsystem_bih.filestorage;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@ConfigurationProperties(prefix = "file")
@Service("fileStorageProperties")
public class FileStorageProperties {
    private String uploadDir;
    
    public FileStorageProperties() {
		// TODO Auto-generated constructor stub
    	this.uploadDir="C:\\data\\bih\\minmaxhours\\upload";
	}
    
    public String getUploadDir() {
        return uploadDir;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }
}