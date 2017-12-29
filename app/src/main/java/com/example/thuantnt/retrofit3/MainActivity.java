package com.example.thuantnt.retrofit3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.thuantnt.retrofit3.adapter.AdapterPhoto;
import com.example.thuantnt.retrofit3.api.ApiClient;
import com.example.thuantnt.retrofit3.api.ApiInterface;
import com.example.thuantnt.retrofit3.listener.EndlessRecyclerViewScrollListener;
import com.example.thuantnt.retrofit3.models.Photo;
import com.example.thuantnt.retrofit3.models.Photo_;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @BindView(R.id.recyclerview)
    RecyclerView recyclerView;

    private String API_KEY = "PK9RQiY19rTiLnmdAWaeEhZSexny6uWxRRNxFhR1";
    private String feature = "popular";
    private int page = 1;

    private AdapterPhoto adapter;
    private List<Photo_> photos;
    private EndlessRecyclerViewScrollListener scrollListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        if (API_KEY.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Add your APi", Toast.LENGTH_LONG).show();
            return;
        } else {
            getData(feature, page, API_KEY);
        }

        //Scrollview
        scrollListener = new EndlessRecyclerViewScrollListener((GridLayoutManager) new GridLayoutManager(getApplicationContext(), 2)) {
            @Override
            public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                loadMoreData(page);
            }
        };
        // Adds the scroll listener to RecyclerView
        recyclerView.addOnScrollListener(scrollListener);


    }

    // loadMoreData
    private void loadMoreData(int offset) {
        getData(feature, page++, API_KEY);
        adapter.notifyDataSetChanged();
        scrollListener.resetState();
    }

    private void getData(String feature, int page, String API_KEY) {
        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<Photo> call = apiService.getPhotos(feature, page, API_KEY);
        call.enqueue(new Callback<Photo>() {
            @Override
            public void onResponse(Call<Photo> call, Response<Photo> response) {
                Log.d(TAG, "onResponse: " + response.toString());
                int statusCode = response.code();
                photos = new ArrayList<>();
                photos = response.body().getPhotos();
                adapter = new AdapterPhoto(MainActivity.this, photos);
                RecyclerView.LayoutManager managerLayout = new GridLayoutManager(getApplicationContext(), 2);
                recyclerView.setLayoutManager(managerLayout);
                recyclerView.setHasFixedSize(true);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<Photo> call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
            }
        });
    }


}
