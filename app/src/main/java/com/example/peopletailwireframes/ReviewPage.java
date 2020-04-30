package com.example.peopletailwireframes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;

public class ReviewPage extends AppCompatActivity {
    BottomAppBar bottomAppBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_page);
        bottomAppBar = findViewById(R.id.action_bar);
        setSupportActionBar(bottomAppBar);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case android.R.id.home:
                Toast.makeText(this, "Home button clicked", Toast.LENGTH_SHORT).show();
                break;



        }
        return true;
    }

    public void onClick (View view){

        Intent intent = new Intent(ReviewPage.this, AddReview.class);
        startActivity(intent);
    }

    public void onClick2 (View view){

        Intent intent = new Intent(ReviewPage.this, Challenge.class);
        startActivity(intent);
    }
    public void viewReview (View view){

        Intent intent = new Intent(ReviewPage.this, AddReview.class);
        startActivity(intent);
    }
}
