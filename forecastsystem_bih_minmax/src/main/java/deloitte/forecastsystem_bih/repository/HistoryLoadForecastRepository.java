package deloitte.forecastsystem_bih.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import deloitte.forecastsystem_bih.model.Country;
import deloitte.forecastsystem_bih.model.HistoryLoadForecast;

@Repository("historyLoadForecastRepository")
public interface HistoryLoadForecastRepository extends CrudRepository<HistoryLoadForecast, Long> {

	@Override
	List<HistoryLoadForecast> findAll();
	
	@Override
	Optional<HistoryLoadForecast> findById(Long id);
	
	@Override
	void delete(HistoryLoadForecast entity);

	@Override
	<S extends HistoryLoadForecast> S save(S entity);
	
    @Query("SELECT hlf.loadForecastData FROM HistoryLoadForecast hlf WHERE hlf.country=:p_country AND hlf.loadDate=:p_loadDate AND hlf.loadHour=:p_loadHour ORDER BY hlf.forecastDate DESC")
    public List<Double> findByDateLoadAndHour(@Param("p_country") Country p_country, @Param("p_loadDate") Date p_loadDate, 
                                           @Param("p_loadHour") Integer p_loadHour); 	
	
	
}
