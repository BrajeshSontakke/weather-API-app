package com.example.weather.model;

public class WeatherResponse {
    private String cityName;
    private double temperature;
    private String description;

    public WeatherResponse() {
    }

    public WeatherResponse(String cityName, double temperature, String description) {
        this.cityName = cityName;
        this.temperature = temperature;
        this.description = description;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}