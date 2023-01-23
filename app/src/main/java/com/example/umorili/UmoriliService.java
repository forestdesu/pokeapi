package com.example.umorili;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

interface UmoriliService {

    // Образец
    // http://www.umori.li/api/get?name=bash&num=5

    @GET("api/v2/pokemon")
    Call<List<UPost>> getData(@Path("name") String resourceName);

    Retrofit retrofit = new Retrofit.Builder()
            //.baseUrl("http://www.umori.li/")
            .baseUrl("https://pokeapi.co/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
