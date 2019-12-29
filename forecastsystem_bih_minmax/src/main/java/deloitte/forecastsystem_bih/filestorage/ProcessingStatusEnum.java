package deloitte.forecastsystem_bih.filestorage;

public enum ProcessingStatusEnum {

	PS_OK, PS_WAIT_FOR_PROCESSING, PS_ERROR_PREPARING, PS_ERROR_PARTIAL_ARIMA, PS_ERROR_PARTIAL_SD, 
	PS_ERROR_COMPLETING, PS_ERROR_ARIMA_FORECAST, PS_ERROR_SD_TODAY, PS_ERROR_LF_TODAY, 
	PS_ERROR_SD_TOMORROW, PS_ERROR_LF_TOMORROW, PS_ERROR_WATHER_HISTORY, PS_ERROR_WEATHER_FORECAST;

	public final int value;
	
	private ProcessingStatusEnum() {
		// TODO Auto-generated constructor stub
		value = 0;
	}
	
	ProcessingStatusEnum(final int value) {
	     this.value = value;
	  }		
	
}
