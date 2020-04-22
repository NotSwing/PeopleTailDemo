package com.example.peopletailwireframes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
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
}
