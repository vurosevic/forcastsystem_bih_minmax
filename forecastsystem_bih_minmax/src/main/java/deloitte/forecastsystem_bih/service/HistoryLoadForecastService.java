package deloitte.forecastsystem_bih.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import deloitte.forecastsystem_bih.model.Country;
import deloitte.forecastsystem_bih.model.HistoryLoadForecast;

public interface HistoryLoadForecastService {

	List<HistoryLoadForecast> findAll();
	Optional<HistoryLoadForecast> findById(Long id);
	void delete(HistoryLoadForecast entity);
	<S extends HistoryLoadForecast> S save(S entity);
    public List<Double> findByDateLoadAndHour(Country p_country, Date p_loadDate, Integer p_loadHour); 	
	
	
}
