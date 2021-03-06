package deloitte.forecastsystem_bih.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="temp_load_forecast_arima")
public class TempLoadForecastArima implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1499074695672018389L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID", nullable=false, updatable = true)
	private Long id;	

    @ManyToOne
    @JoinColumn(name = "Country_fk")
    private Country country;		

	@Column(name="Load_date")
	private Date loadDate;    
    
	@Column(name="Load_hour")
	private Integer loadHour;
	
	@Column(name="Load_minute")
	private Integer loadMinute;	

	@Column(name="Load_forecast_arima")
	private Double loadForecastArima;
	
	@Column(name="Forecast_date")
	private Date forecastDate;

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

	public Date getLoadDate() {
		return loadDate;
	}

	public void setLoadDate(Date loadDate) {
		this.loadDate = loadDate;
	}

	public Integer getLoadHour() {
		return loadHour;
	}

	public void setLoadHour(Integer loadHour) {
		this.loadHour = loadHour;
	}

	public Integer getLoadMinute() {
		return loadMinute;
	}

	public void setLoadMinute(Integer loadMinute) {
		this.loadMinute = loadMinute;
	}

	public Double getLoadForecastArima() {
		return loadForecastArima;
	}

	public void setLoadForecastArima(Double loadForecastArima) {
		this.loadForecastArima = loadForecastArima;
	}

	public Date getForecastDate() {
		return forecastDate;
	}

	public void setForecastDate(Date forecastDate) {
		this.forecastDate = forecastDate;
	}	

}
