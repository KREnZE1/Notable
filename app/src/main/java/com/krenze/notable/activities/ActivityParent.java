package com.krenze.notable.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public abstract class ActivityParent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Notable");
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {}
}
