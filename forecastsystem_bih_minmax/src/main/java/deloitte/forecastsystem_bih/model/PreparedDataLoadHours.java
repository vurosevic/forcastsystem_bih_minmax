package deloitte.forecastsystem_bih.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.TimeZone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="df_prepared_data_loadhours")
public class PreparedDataLoadHours implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6018342730783264451L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID", nullable=false, updatable = true)
	private Long id;	

    @ManyToOne
    @JoinColumn(name = "Country_fk")
    private Country country;		
	
	@Column(name="Load_hour")
	private Integer loadHour;	
	
	@Column(name="Tip_dana")
	private Integer tipDana;
	
	@Column(name="Dan")
	private Integer dan;
	
	@Column(name="Mesec")
	private Integer mesec;	

	@Column(name="Godina")
	private Integer godina;
	
	@Column(name="Holiday")
	private Integer holiday;			
	
	@Column(name="MAX_Temperature4")
	private Double maxTemperature4;
	
	@Column(name="MIN_Temperature4")
	private Double minTemperature4;	

	@Column(name="AVG_Wind4")
	private Double avgWind4;
	
	@Column(name="AVG_Humidity4")
	private Double avgHumidity4;	

	@Column(name="AVG_Dew_point4")
	private Double avgDewPoint4;
	
	@Column(name="AVG_Pressure4")
	private Double avgPressure4;	

	@Column(name="AVG_Load_forecast_arima4")
	private Double avgLoadForecastArima4;
	
	@Column(name="AVG_Load_forecast_similarday4")
	private Double avgLoadForecastSimilarDay4;	
	
	@Column(name="AVG_Load_real_data4")
	private Double avgLoadRealData4;		
	
	@Column(name="MAX_Temperature3")
	private Double maxTemperature3;
	
	@Column(name="MIN_Temperature3")
	private Double minTemperature3;	

	@Column(name="AVG_Wind3")
	private Double avgWind3;
	
	@Column(name="AVG_Humidity3")
	private Double avgHumidity3;	

	@Column(name="AVG_Dew_point3")
	private Double avgDewPoint3;
	
	@Column(name="AVG_Pressure3")
	private Double avgPressure3;	

	@Column(name="AVG_Load_forecast_arima3")
	private Double avgLoadForecastArima3;
	
	@Column(name="AVG_Load_forecast_similarday3")
	private Double avgLoadForecastSimilarDay3;
	
	@Column(name="AVG_Load_real_data3")
	private Double avgLoadRealData3;
		
	@Column(name="MAX_Temperature2")
	private Double maxTemperature2;
	
	@Column(name="MIN_Temperature2")
	private Double minTemperature2;	

	@Column(name="AVG_Wind2")
	private Double avgWind2;
	
	@Column(name="AVG_Humidity2")
	private Double avgHumidity2;	

	@Column(name="AVG_Dew_point2")
	private Double avgDewPoint2;
	
	@Column(name="AVG_Pressure2")
	private Double avgPressure2;	

	@Column(name="AVG_Load_forecast_arima2")
	private Double avgLoadForecastArima2;
	
	@Column(name="AVG_Load_forecast_similarday2")
	private Double avgLoadForecastSimilarDay2;
	
	@Column(name="AVG_Load_real_data2")
	private Double avgLoadRealData2;
	
	@Column(name="MAX_Temperature")
	private Double maxTemperature;
	
	@Column(name="MIN_Temperature")
	private Double minTemperature;	

	@Column(name="AVG_Wind")
	private Double avgWind;
	
	@Column(name="AVG_Humidity")
	private Double avgHumidity;	

	@Column(name="AVG_Dew_point")
	private Double avgDewPoint;
	
	@Column(name="AVG_Pressure")
	private Double avgPressure;	

	@Column(name="AVG_Load_forecast_arima")
	private Double avgLoadForecastArima;
	
	@Column(name="AVG_Load_forecast_similarday")
	private Double avgLoadForecastSimilarDay;
	
	@Column(name="AVG_Load_real_data")
	private Double avgLoadRealData;	
		
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Integer getLoadHour() {
		return loadHour;
	}

	public void setLoadHour(Integer loadHour) {
		this.loadHour = loadHour;
	}

	public Integer getTipDana() {
		return tipDana;
	}

	public void setTipDana(Integer tipDana) {
		this.tipDana = tipDana;
	}

	public Integer getDan() {
		return dan;
	}

	public void setDan(Integer dan) {
		this.dan = dan;
	}

	public Integer getMesec() {
		return mesec;
	}

	public void setMesec(Integer mesec) {
		this.mesec = mesec;
	}

	public Integer getGodina() {
		return godina;
	}

	public void setGodina(Integer godina) {
		this.godina = godina;
	}

	public Integer getHoliday() {
		return holiday;
	}

	public void setHoliday(Integer holiday) {
		this.holiday = holiday;
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

	public Double getAvgWind4() {
		return avgWind4;
	}

	public void setAvgWind4(Double avgWind4) {
		this.avgWind4 = avgWind4;
	}

	public Double getAvgHumidity4() {
		return avgHumidity4;
	}

	public void setAvgHumidity4(Double avgHumidity4) {
		this.avgHumidity4 = avgHumidity4;
	}

	public Double getAvgDewPoint4() {
		return avgDewPoint4;
	}

	public void setAvgDewPoint4(Double avgDewPoint4) {
		this.avgDewPoint4 = avgDewPoint4;
	}

	public Double getAvgPressure4() {
		return avgPressure4;
	}

	public void setAvgPressure4(Double avgPressure4) {
		this.avgPressure4 = avgPressure4;
	}

	public Double getAvgLoadForecastArima4() {
		return avgLoadForecastArima4;
	}

	public void setAvgLoadForecastArima4(Double avgLoadForecastArima4) {
		this.avgLoadForecastArima4 = avgLoadForecastArima4;
	}

	public Double getAvgLoadForecastSimilarDay4() {
		return avgLoadForecastSimilarDay4;
	}

	public void setAvgLoadForecastSimilarDay4(Double avgLoadForecastSimilarDay4) {
		this.avgLoadForecastSimilarDay4 = avgLoadForecastSimilarDay4;
	}

	public Double getAvgLoadRealData4() {
		return avgLoadRealData4;
	}

	public void setAvgLoadRealData4(Double avgLoadRealData4) {
		this.avgLoadRealData4 = avgLoadRealData4;
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

	public Double getAvgWind3() {
		return avgWind3;
	}

	public void setAvgWind3(Double avgWind3) {
		this.avgWind3 = avgWind3;
	}

	public Double getAvgHumidity3() {
		return avgHumidity3;
	}

	public void setAvgHumidity3(Double avgHumidity3) {
		this.avgHumidity3 = avgHumidity3;
	}

	public Double getAvgDewPoint3() {
		return avgDewPoint3;
	}

	public void setAvgDewPoint3(Double avgDewPoint3) {
		this.avgDewPoint3 = avgDewPoint3;
	}

	public Double getAvgPressure3() {
		return avgPressure3;
	}

	public void setAvgPressure3(Double avgPressure3) {
		this.avgPressure3 = avgPressure3;
	}

	public Double getAvgLoadForecastArima3() {
		return avgLoadForecastArima3;
	}

	public void setAvgLoadForecastArima3(Double avgLoadForecastArima3) {
		this.avgLoadForecastArima3 = avgLoadForecastArima3;
	}

	public Double getAvgLoadForecastSimilarDay3() {
		return avgLoadForecastSimilarDay3;
	}

	public void setAvgLoadForecastSimilarDay3(Double avgLoadForecastSimilarDay3) {
		this.avgLoadForecastSimilarDay3 = avgLoadForecastSimilarDay3;
	}

	public Double getAvgLoadRealData3() {
		return avgLoadRealData3;
	}

	public void setAvgLoadRealData3(Double avgLoadRealData3) {
		this.avgLoadRealData3 = avgLoadRealData3;
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

	public Double getAvgWind2() {
		return avgWind2;
	}

	public void setAvgWind2(Double avgWind2) {
		this.avgWind2 = avgWind2;
	}

	public Double getAvgHumidity2() {
		return avgHumidity2;
	}

	public void setAvgHumidity2(Double avgHumidity2) {
		this.avgHumidity2 = avgHumidity2;
	}

	public Double getAvgDewPoint2() {
		return avgDewPoint2;
	}

	public void setAvgDewPoint2(Double avgDewPoint2) {
		this.avgDewPoint2 = avgDewPoint2;
	}

	public Double getAvgPressure2() {
		return avgPressure2;
	}

	public void setAvgPressure2(Double avgPressure2) {
		this.avgPressure2 = avgPressure2;
	}

	public Double getAvgLoadForecastArima2() {
		return avgLoadForecastArima2;
	}

	public void setAvgLoadForecastArima2(Double avgLoadForecastArima2) {
		this.avgLoadForecastArima2 = avgLoadForecastArima2;
	}

	public Double getAvgLoadForecastSimilarDay2() {
		return avgLoadForecastSimilarDay2;
	}

	public void setAvgLoadForecastSimilarDay2(Double avgLoadForecastSimilarDay2) {
		this.avgLoadForecastSimilarDay2 = avgLoadForecastSimilarDay2;
	}

	public Double getAvgLoadRealData2() {
		return avgLoadRealData2;
	}

	public void setAvgLoadRealData2(Double avgLoadRealData2) {
		this.avgLoadRealData2 = avgLoadRealData2;
	}

	public Double getMaxTemperature() {
		return maxTemperature;
	}

	public void setMaxTemperature(Double maxTemperature) {
		this.maxTemperature = maxTemperature;
	}

	public Double getMinTemperature() {
		return minTemperature;
	}

	public void setMinTemperature(Double minTemperature) {
		this.minTemperature = minTemperature;
	}

	public Double getAvgWind() {
		return avgWind;
	}

	public void setAvgWind(Double avgWind) {
		this.avgWind = avgWind;
	}

	public Double getAvgHumidity() {
		return avgHumidity;
	}

	public void setAvgHumidity(Double avgHumidity) {
		this.avgHumidity = avgHumidity;
	}

	public Double getAvgDewPoint() {
		return avgDewPoint;
	}

	public void setAvgDewPoint(Double avgDewPoint) {
		this.avgDewPoint = avgDewPoint;
	}

	public Double getAvgPressure() {
		return avgPressure;
	}

	public void setAvgPressure(Double avgPressure) {
		this.avgPressure = avgPressure;
	}

	public Double getAvgLoadForecastArima() {
		return avgLoadForecastArima;
	}

	public void setAvgLoadForecastArima(Double avgLoadForecastArima) {
		this.avgLoadForecastArima = avgLoadForecastArima;
	}

	public Double getAvgLoadForecastSimilarDay() {
		return avgLoadForecastSimilarDay;
	}

	public void setAvgLoadForecastSimilarDay(Double avgLoadForecastSimilarDay) {
		this.avgLoadForecastSimilarDay = avgLoadForecastSimilarDay;
	}

	public Double getAvgLoadRealData() {
		return avgLoadRealData;
	}

	public void setAvgLoadRealData(Double avgLoadRealData) {
		this.avgLoadRealData = avgLoadRealData;
	}

	public double[] preparedVector() {
		double[] retval = {
			this.loadHour,
			this.tipDana, this.dan, this.mesec, this.godina, this.holiday,
			this.maxTemperature4, this.minTemperature4, this.avgWind4, 
			this.avgHumidity4, this.avgDewPoint4, this.avgPressure4, 
			this.avgLoadForecastArima4, this.avgLoadForecastSimilarDay4, this.avgLoadRealData4,
			this.maxTemperature3, this.minTemperature3, this.avgWind3, 
			this.avgHumidity3, this.avgDewPoint3, this.avgPressure3, 
			this.avgLoadForecastArima3, this.avgLoadForecastSimilarDay3,  this.avgLoadRealData3,
			this.maxTemperature2, this.minTemperature2, this.avgWind2, 
			this.avgHumidity2, this.avgDewPoint2, this.avgPressure2, 
			this.avgLoadForecastArima2, this.avgLoadForecastSimilarDay2,  this.avgLoadRealData2,		
			this.maxTemperature, this.minTemperature, this.avgWind, 
			this.avgHumidity, this.avgDewPoint, this.avgPressure, 
			this.avgLoadForecastArima, this.avgLoadForecastSimilarDay};			
		return retval;
	}    
	
	public double[] preparedVectorToday() {
		
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Belgrade"));		
		cal.set(this.godina, this.mesec-1, this.dan+1);	
		
		double[] retval = {
			this.loadHour,
			cal.get(Calendar.DAY_OF_WEEK), cal.get(Calendar.DAY_OF_MONTH), (cal.get(Calendar.MONTH)+1), cal.get(Calendar.YEAR), 		
			
			this.maxTemperature3, this.minTemperature3, this.avgWind3, 
			this.avgHumidity3, this.avgDewPoint3, this.avgPressure3, 
			this.avgLoadForecastArima3, this.avgLoadForecastSimilarDay3,  this.avgLoadRealData3,
			
			this.maxTemperature2, this.minTemperature2, this.avgWind2, 
			this.avgHumidity2, this.avgDewPoint2, this.avgPressure2, 
			this.avgLoadForecastArima2, this.avgLoadForecastSimilarDay2,  this.avgLoadRealData2,
			
			this.maxTemperature, this.minTemperature, this.avgWind, 
			this.avgHumidity, this.avgDewPoint, this.avgPressure, 
			this.avgLoadForecastArima, this.avgLoadForecastSimilarDay,  this.avgLoadRealData,
			
			0, 0, 0, 
			0, 0, 0, 
			0, 0};
		
		return retval;
	}	
	
	public double[] preparedVectorTomorrow() {
		
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Belgrade"));		
		cal.set(this.godina, this.mesec-1, this.dan+1);	
		
		double[] retval = {
			this.loadHour,
			cal.get(Calendar.DAY_OF_WEEK), cal.get(Calendar.DAY_OF_MONTH), (cal.get(Calendar.MONTH)+1), cal.get(Calendar.YEAR), 		
								
			this.maxTemperature2, this.minTemperature2, this.avgWind2, 
			this.avgHumidity2, this.avgDewPoint2, this.avgPressure2, 
			this.avgLoadForecastArima2, this.avgLoadForecastSimilarDay2,  this.avgLoadRealData2,
			
			this.maxTemperature, this.minTemperature, this.avgWind, 
			this.avgHumidity, this.avgDewPoint, this.avgPressure, 
			this.avgLoadForecastArima, this.avgLoadForecastSimilarDay,  this.avgLoadRealData,
			
			0, 0, 0, 
			0, 0, 0, 
			0, 0, 0,			
			
			0, 0, 0, 
			0, 0, 0, 
			0, 0};
		
		return retval;
	}	

}
