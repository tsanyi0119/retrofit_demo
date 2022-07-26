package com.example.retrofit_demo.api;

import com.example.retrofit_demo.response.DataResponse;


import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
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
 * 不重複的URL 設在 @GET 或 @POST 後方
 * @GET("C-B0025-001?")
 *
 **/
public interface APIService {
    @GET("C-B0025-001?")
    Observable<DataResponse> getDailyRainfall(@Query("Authorization") String Authorization);
}
