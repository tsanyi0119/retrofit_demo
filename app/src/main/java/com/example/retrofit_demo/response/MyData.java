package com.example.retrofit_demo.response;

public class MyData {
    String dataDate;
    String preciPitation;
    public MyData(String dataDate,String preciPitation) {
        this.dataDate = dataDate;
        this.preciPitation = preciPitation;
    }

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate;
    }

    public String getPreciPitation() {
        return preciPitation;
    }

    public void setPreciPitation(String preciPitation) {
        this.preciPitation = preciPitation;
    }
}
