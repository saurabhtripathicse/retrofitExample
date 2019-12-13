package com.saurabh.retrofitexample.repo;

import android.app.Activity;
import android.util.Log;

import com.saurabh.retrofitexample.model.UserData;
import com.saurabh.retrofitexample.network.OkHttpCall;
import com.saurabh.retrofitexample.url_.ApiCallUrl;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class APICallRepo {

    private Activity activity;

    public APICallRepo(Activity activity) {
        this.activity = activity;
    }

    public void getDataFromServer(String token){


        ApiCallUrl apiCallUrl = OkHttpCall.getClient().create(ApiCallUrl.class);

        apiCallUrl.getUser(token).enqueue(new Callback<ArrayList<UserData>>() {
            @Override
            public void onResponse(Call<ArrayList<UserData>> call, Response<ArrayList<UserData>> response) {


                if(response.isSuccessful()){

                    ArrayList<UserData> arrayList = response.body();
                    for (UserData user: arrayList) {
                        Log.i("APPDATA", user.getName());
                    }


                }

            }

            @Override
            public void onFailure(Call<ArrayList<UserData>> call, Throwable t) {
               t.printStackTrace();
            }
        });


    }


}
