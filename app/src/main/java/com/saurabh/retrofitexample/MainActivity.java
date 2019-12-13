package com.saurabh.retrofitexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.saurabh.retrofitexample.repo.APICallRepo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        APICallRepo apiCallRepo = new APICallRepo(this);
        apiCallRepo.getDataFromServer("sgjr4");

    }
}
