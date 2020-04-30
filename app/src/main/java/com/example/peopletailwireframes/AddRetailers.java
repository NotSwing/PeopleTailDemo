package com.example.peopletailwireframes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddRetailers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_retailers);
    }

    public void retailBackButton (View view){

        Intent intent = new Intent(AddRetailers.this, AddReview.class);
        startActivity(intent);
    }
}
