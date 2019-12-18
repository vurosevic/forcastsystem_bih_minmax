/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deloitte.forecastsystem_bih.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import deloitte.forecastsystem_bih.model.WeatherForecast;
import deloitte.forecastsystem_bih.model.WeatherForecastDaily;

/**
 *
 * @author Vladimir
 */
public interface WeatherForecastDailyService {
    
    public List<WeatherForecastDaily> findAll();
    public Optional<WeatherForecastDaily> findById(Long id);
    public <S extends WeatherForecastDaily> S save(S s);
    public void delete(WeatherForecastDaily t);
    public List<WeatherForecastDaily> findByDate(WeatherForecast p_weatherForecast);    
     
    public List<WeatherForecastDaily> findByDay(Date p_Day_forecast);    

}
