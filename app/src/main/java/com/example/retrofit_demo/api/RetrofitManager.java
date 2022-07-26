package com.example.retrofit_demo.api;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 *
 * 本局所屬地面測站每日雨量資料-每日雨量
 * https://opendata.cwb.gov.tw/api/v1/rest/datastore/C-B0025-001?Authorization=CWB-F466F13C-84CD-4A6E-81CB-F3ED6C48A773
 *
 * 月平均-局屬地面測站資料
 * https://opendata.cwb.gov.tw/api/v1/rest/datastore/C-B0027-001?Authorization=CWB-F466F13C-84CD-4A6E-81CB-F3ED6C48A773
 *
 * 氣象測站基本資料-有人氣象測站基本資料
 * https://opendata.cwb.gov.tw/api/v1/rest/datastore/C-B0074-001?Authorization=CWB-F466F13C-84CD-4A6E-81CB-F3ED6C48A773
 *
 * 把重複的URL 設在 baseUrl
 * https://opendata.cwb.gov.tw/api/v1/rest/datastore/
 *
 **/

public class RetrofitManager {
    private static RetrofitManager mInstance = new RetrofitManager();
    private APIService apiService;
    private RetrofitManager() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://opendata.cwb.gov.tw/api/v1/rest/datastore/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        apiService = retrofit.create(APIService.class);
    }
    //向外提供 RetrofitManager
    public static RetrofitManager getInstance() {
        return mInstance;
    }
    //向外提供 APIService
    public APIService getAPI() {
        return apiService;
    }
}
