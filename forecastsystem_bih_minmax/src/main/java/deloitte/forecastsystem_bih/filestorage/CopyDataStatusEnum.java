package deloitte.forecastsystem_bih.filestorage;

public enum CopyDataStatusEnum {
	
	CDS_OK, CDS_ERROR, CDS_WAITHING;

	public final int value;
	
	private CopyDataStatusEnum() {
		// TODO Auto-generated constructor stub
		value = 0;
	}
	
	CopyDataStatusEnum(final int value) {
	     this.value = value;
	  }	
}
