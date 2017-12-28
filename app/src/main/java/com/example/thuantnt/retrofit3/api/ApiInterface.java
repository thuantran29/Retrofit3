package com.example.thuantnt.retrofit3.api;

import com.example.thuantnt.retrofit3.models.PhotoResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by thuan.tnt on 28/12/2017.
 */

//String url ="https://api.500px.com/v1/photos?feature=popular&page=1&consumer_key=API_KEY";

public interface ApiInterface {

    @GET("photos")
    Call<PhotoResponse> getPhotos(@Query("feature") String feature,
                                  @Query("page") int page,
                                  @Query("consumer_key") String apiKey);

    @GET("photos?feature=popular&page=1&")
    Call<PhotoResponse> getPhotoResponse(@Query("consumer_key") String apiKey);
}
