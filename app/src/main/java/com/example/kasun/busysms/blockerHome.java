package com.example.kasun.busysms;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class blockerHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blocker_home);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
