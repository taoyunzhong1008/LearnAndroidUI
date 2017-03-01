package com.ted.learnandroidui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import customview.RandomNumberView;

public class MainActivity extends AppCompatActivity {

    private RandomNumberView mRandowNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mRandowNumber = (RandomNumberView) findViewById(R.id.custom_random_number);
    }
}
