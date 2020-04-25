package com.example.peopletailwireframes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Reviews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
