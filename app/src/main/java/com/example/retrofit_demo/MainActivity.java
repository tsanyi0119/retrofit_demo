package com.example.retrofit_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.retrofit_demo.adapter.RecyclerViewAdapter;
import com.example.retrofit_demo.api.APIService;
import com.example.retrofit_demo.api.RetrofitManager;
import com.example.retrofit_demo.response.DataResponse;
import com.example.retrofit_demo.response.LocalData;
import com.example.retrofit_demo.response.Location;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    APIService apiService;
    LocalData localData = new LocalData();
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    //112311111
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerViewAdapter = new RecyclerViewAdapter();
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        apiService = RetrofitManager.getInstance().getAPI();

//        Call<DataResponse> call = apiService.getDailyRainfall(localData.getAuthorization());
//        call.enqueue(new Callback<DataResponse>() {
//            @Override
//            public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
//                Log.d("TESTTEST","precipitation：" + response.body().getRecords()
//                        .getLocation()
//                        .get(0).getStationObsTimes()
//                        .getStationObsTime()
//                        .get(0).getWeatherElements()
//                        .getPrecipitation());
//            }
//
//            @Override
//            public void onFailure(Call<DataResponse> call, Throwable t) {
//
//            }
//        });



        apiService.getDailyRainfall(localData.getAuthorization())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<DataResponse>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        // 被訂閱時
                        Log.d("TESTTEST","onSubscribe...");
                    }
                    @Override
                    public void onNext(DataResponse dataResponse) {
                        //有資料回傳時
                        Log.d("TESTTEST","precipitation：" + dataResponse.getRecords()
                                .getLocation()
                                .get(0).getStationObsTimes()
                                .getStationObsTime()
                                .get(0).getWeatherElements()
                                .getPrecipitation());
                    }
                    @Override
                    public void onError(Throwable e) {
                        //失敗處理
                        Log.d("TESTTEST","onError...");
                    }
                    @Override
                    public void onComplete() {
                        //成功處理
                        Log.d("TESTTEST","onComplete...");
                    }
                });
    }
}