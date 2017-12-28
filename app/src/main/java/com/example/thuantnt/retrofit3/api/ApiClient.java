package com.example.thuantnt.retrofit3.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by thuan.tnt on 28/12/2017.
 */
//String url ="https://api.500px.com/v1/photos?feature=popular&page=1&consumer_key=API_KEY";

public class ApiClient {
    public static final String BASE_URL = "https://api.500px.com/v1/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
