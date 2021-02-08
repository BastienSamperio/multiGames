package com.example.multigame.utils;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.multigame.R;
import com.example.multigame.activity.CreatePlayerActivity;

public class ActivityUtils {

    public static void launchActivity(AppCompatActivity activity, Class className, boolean isFinish, boolean isSlide) {
        Intent intent = new Intent(activity, className);
        activity.startActivity(intent);
        if (isSlide){
            activity.overridePendingTransition(R.anim.slide_in_from_right, R.anim.fade_out);
        } else {
            activity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        }
        if (isFinish){
            activity.finish();
        }
    }
}
