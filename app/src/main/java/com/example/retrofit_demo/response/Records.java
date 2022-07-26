package com.example.retrofit_demo.response;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Records {
    private List<Location> location = new ArrayList<>();

    public Records(List<Location> location){
        this.location = location;
    }

    public List<Location> getLocation() {
        return location;
    }

    public void setLocation(List<Location> location) {
        this.location = location;
    }
}
