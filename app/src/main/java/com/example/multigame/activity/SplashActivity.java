package com.example.multigame.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.multigame.R;
import com.example.multigame.utils.ActivityUtils;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        launchMainView();
    };


    private void launchMainView() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ActivityUtils.launchActivity(SplashActivity.this,CreatePlayerActivity.class, true,true);

            }
        }, 10000);
    };
}

