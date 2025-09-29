package com.example.weather.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.weather.model.WeatherResponse;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    private final String API_URL = "http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric";
        
    public WeatherResponse getWeather(String city) {
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format(API_URL, city, apiKey);
        // Get response as Map
        java.util.Map response = restTemplate.getForObject(url, java.util.Map.class);
        if (response == null || response.get("main") == null || response.get("weather") == null) {
            return null;
        }
        java.util.Map main = (java.util.Map) response.get("main");
        java.util.List weatherList = (java.util.List) response.get("weather");
        java.util.Map weather = weatherList.isEmpty() ? null : (java.util.Map) weatherList.get(0);
        String cityName = (String) response.get("name");
        double temperature = main.get("temp") instanceof Number ? ((Number) main.get("temp")).doubleValue() : 0.0;
        String description = weather != null ? (String) weather.get("description") : "";
        return new WeatherResponse(cityName, temperature, description);
    }
}
