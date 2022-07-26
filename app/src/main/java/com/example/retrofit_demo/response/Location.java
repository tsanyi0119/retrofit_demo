package com.example.retrofit_demo.response;

public class Location {
    private Station station;
    private StationObsTimes stationObsTimes;

    public Location(Station station, StationObsTimes stationObsTimes) {
        this.station = station;
        this.stationObsTimes = stationObsTimes;
    }

    public Station getStation() {
        return station;
    }

    public StationObsTimes getStationObsTimes() {
        return stationObsTimes;
    }
}
