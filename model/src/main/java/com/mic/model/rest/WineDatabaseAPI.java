package com.mic.model.rest;

import com.mic.model.entities.WineList;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by tomywu on 7/9/15.
 */
public interface WineDatabaseAPI {
    @GET("movie/{id}")
    Call<WineList> wineList(
            @Path("id") String id,
            @Query("api_key") String apiKey
    );
}
