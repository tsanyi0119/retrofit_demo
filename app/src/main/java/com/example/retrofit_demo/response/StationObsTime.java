package com.example.retrofit_demo.response;

import java.util.List;

public class StationObsTime {
    private String dataDate;
    private WeatherElements weatherElements;

    public StationObsTime(String dataDate,WeatherElements weatherElements) {
        this.dataDate = dataDate;
        this.weatherElements = weatherElements;
    }

    public String getDataDate() {
        return dataDate;
    }

    public WeatherElements getWeatherElements() {
        return weatherElements;
    }
}
