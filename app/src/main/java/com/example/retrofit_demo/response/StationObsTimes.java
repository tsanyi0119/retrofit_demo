package com.example.retrofit_demo.response;

import java.util.ArrayList;
import java.util.List;

public class StationObsTimes {
    private List<StationObsTime> stationObsTime;

    public StationObsTimes(List<StationObsTime> stationObsTime) {
        this.stationObsTime = stationObsTime;
    }

    public List<StationObsTime> getStationObsTime() {
        return stationObsTime;
    }
}
