package com.example.retrofit_demo.response;

public class WeatherElements {
    private String precipitation;
    public WeatherElements(String precipitation) {
        this.precipitation = precipitation;
    }

    public String getPrecipitation() {
        return precipitation;
    }
}
