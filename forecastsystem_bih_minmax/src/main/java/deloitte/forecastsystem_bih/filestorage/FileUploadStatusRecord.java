package deloitte.forecastsystem_bih.filestorage;

public class FileUploadStatusRecord {
	
	int fileStatus;
	int fileCopyStatus;
	int fileProcessingStatus;
	
	public FileUploadStatusRecord() {
		// TODO Auto-generated constructor stub
		this.fileCopyStatus = -1;
		this.fileProcessingStatus = -1;
		this.fileStatus = -1;
	}
	
	public int getFileStatus() {
		return fileStatus;
	}
	public void setFileStatus(int fileStatus) {
		this.fileStatus = fileStatus;
	}
	public int getFileCopyStatus() {
		return fileCopyStatus;
	}
	public void setFileCopyStatus(int fileCopyStatus) {
		this.fileCopyStatus = fileCopyStatus;
	}
	public int getFileProcessingStatus() {
		return fileProcessingStatus;
	}
	public void setFileProcessingStatus(int fileProcessingStatus) {
		this.fileProcessingStatus = fileProcessingStatus;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "FileUploadStatus:: fileStatus=" + fileStatus + " , fileCopyStatus=" + fileCopyStatus + " , fileProcessingStatus=" + fileCopyStatus;
	}

}
