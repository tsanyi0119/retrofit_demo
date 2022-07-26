package com.example.retrofit_demo.response;

import com.google.gson.annotations.SerializedName;

public class Station {
    private String stationID;
    private String stationName;
    private String stationNameEN;
    private String stationAttribute;

    public Station(String stationID, String stationName, String stationNameEN, String stationAttribute) {
        this.stationID = stationID;
        this.stationName = stationName;
        this.stationNameEN = stationNameEN;
        this.stationAttribute = stationAttribute;
    }

    public String getStationID() {
        return stationID;
    }

    public String getStationName() {
        return stationName;
    }

    public String getStationNameEN() {
        return stationNameEN;
    }

    public String getStationAttribute() {
        return stationAttribute;
    }
}
