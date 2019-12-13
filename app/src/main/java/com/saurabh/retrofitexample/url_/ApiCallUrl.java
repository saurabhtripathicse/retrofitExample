package com.saurabh.retrofitexample.url_;

import com.saurabh.retrofitexample.model.UserData;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiCallUrl {

    @GET("bins/{token}")
    Call<ArrayList<UserData>> getUser(@Path("token") String token);

}
