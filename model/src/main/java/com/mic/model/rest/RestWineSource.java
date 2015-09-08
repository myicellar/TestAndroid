package com.mic.model.rest;

import com.mic.model.entities.WineList;
import com.squareup.otto.Bus;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;


/**
 * Created by tomywu on 7/9/15.
 */
public class RestWineSource {

    private final WineDatabaseAPI wineDBApi;
    private final Bus bus;

    public RestWineSource(Bus bus){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.themoviedb.org/3/").addConverterFactory(GsonConverterFactory.create())
                .build();

        wineDBApi = retrofit.create(WineDatabaseAPI.class);
        this.bus = bus;
    }

    public void getWines() {
        Call<WineList> call = wineDBApi.wineList("550", "87a901020f496977f9d6d508c5d186ec");

        call.enqueue(new Callback<WineList>() {
            @Override
            public void onResponse(Response<WineList> response) {
                WineList wine = response.body();

                bus.post(wine);
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });


    }
}
