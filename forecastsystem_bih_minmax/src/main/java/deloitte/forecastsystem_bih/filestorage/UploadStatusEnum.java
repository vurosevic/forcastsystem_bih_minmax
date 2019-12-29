package deloitte.forecastsystem_bih.filestorage;

public enum UploadStatusEnum {
	
	US_FILE_OK, US_ERROR_FILE_TYPE, US_ERROR_ROWS, US_ERROR_DATE, US_ERROR_HOURS, US_ERROR_LOAD_VALUE;

	public final int value;
	
	private UploadStatusEnum() {
		// TODO Auto-generated constructor stub
		value = 0;
	}
	
	UploadStatusEnum(final int value) {
	     this.value = value;
	  }	
}
