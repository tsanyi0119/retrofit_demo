package com.example.retrofit_demo.response;

import com.google.gson.annotations.SerializedName;

public class DataResponse {
    /** *
     * 中括號要用List，大括號則用Class
     * **/
    @SerializedName("records")
    private Records records;

    public DataResponse(Records records) {
        this.records = records;
    }

    public Records getRecords() {
        return records;
    }

    public void setRecords(Records records) {
        this.records = records;
    }
}
