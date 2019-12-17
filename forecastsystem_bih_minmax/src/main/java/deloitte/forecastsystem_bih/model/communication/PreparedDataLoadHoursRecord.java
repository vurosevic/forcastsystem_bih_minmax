package deloitte.forecastsystem_bih.model.communication;
public class PreparedDataLoadHoursRecord {
	
	Long id;
	Double maxTemperature4;
	Double minTemperature4;
	Double avgLoadRealData4;
	Double maxTemperature3;
	Double minTemperature3;
	Double avgLoadRealData3;
	Double maxTemperature2;
	Double minTemperature2;
	Double avgLoadRealData2;
	Double avgLoadRealData;
	
	public PreparedDataLoadHoursRecord() {
		// TODO Auto-generated constructor stub
		this.id = 0L;
	}
	
	public PreparedDataLoadHoursRecord( Long id, 
										Double maxTemperature4, Double minTemperature4,     Double avgLoadRealData4,
										Double maxTemperature3, Double minTemperature3, 	Double avgLoadRealData3, 
										Double maxTemperature2, Double minTemperature2, 	Double avgLoadRealData2,
										Double avgLoadRealData) {
		this.id = id;
		this.maxTemperature4 = maxTemperature4;
		this.minTemperature4 = minTemperature4;
		this.avgLoadRealData4 = avgLoadRealData4;		
		this.maxTemperature3 = maxTemperature3;
		this.minTemperature3 = minTemperature3;
		this.avgLoadRealData3 = avgLoadRealData3;		
		this.maxTemperature2 = maxTemperature2;
		this.minTemperature2 = minTemperature2;
		this.avgLoadRealData2 = avgLoadRealData2;		
		this.avgLoadRealData = avgLoadRealData;				
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getAvgLoadRealData4() {
		return avgLoadRealData4;
	}

	public void setAvgLoadRealData4(Double avgLoadRealData4) {
		this.avgLoadRealData4 = avgLoadRealData4;
	}

	public Double getAvgLoadRealData3() {
		return avgLoadRealData3;
	}

	public void setAvgLoadRealData3(Double avgLoadRealData3) {
		this.avgLoadRealData3 = avgLoadRealData3;
	}

	public Double getAvgLoadRealData2() {
		return avgLoadRealData2;
	}

	public void setAvgLoadRealData2(Double avgLoadRealData2) {
		this.avgLoadRealData2 = avgLoadRealData2;
	}

	public Double getAvgLoadRealData() {
		return avgLoadRealData;
	}

	public void setAvgLoadRealData(Double avgLoadRealData) {
		this.avgLoadRealData = avgLoadRealData;
	}

	public Double getMaxTemperature4() {
		return maxTemperature4;
	}

	public void setMaxTemperature4(Double maxTemperature4) {
		this.maxTemperature4 = maxTemperature4;
	}

	public Double getMinTemperature4() {
		return minTemperature4;
	}

	public void setMinTemperature4(Double minTemperature4) {
		this.minTemperature4 = minTemperature4;
	}

	public Double getMaxTemperature3() {
		return maxTemperature3;
	}

	public void setMaxTemperature3(Double maxTemperature3) {
		this.maxTemperature3 = maxTemperature3;
	}

	public Double getMinTemperature3() {
		return minTemperature3;
	}

	public void setMinTemperature3(Double minTemperature3) {
		this.minTemperature3 = minTemperature3;
	}

	public Double getMaxTemperature2() {
		return maxTemperature2;
	}

	public void setMaxTemperature2(Double maxTemperature2) {
		this.maxTemperature2 = maxTemperature2;
	}

	public Double getMinTemperature2() {
		return minTemperature2;
	}

	public void setMinTemperature2(Double minTemperature2) {
		this.minTemperature2 = minTemperature2;
	}
	
	
	
}
