package com.example.peopletailwireframes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;

import java.net.Inet4Address;

public class ReviewPage extends AppCompatActivity {
    BottomAppBar bottomAppBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_page);
        bottomAppBar = findViewById(R.id.action_bar);
        setSupportActionBar(bottomAppBar);

        ImageButton button = (ImageButton)findViewById(R.id.nextPage);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewReview();
            }
        });
    }

    public void viewReview()
    {
        Intent intent = new Intent(this, Reviews.class);
        startActivity(intent);
    }

    public void onClick(View view)
    {
        ImageButton homeButton = findViewById(R.id.home);
        ImageButton challengeButton = findViewById(R.id.challenges);
        if(homeButton.isPressed())
        {
            Toast.makeText(this, "Home button clicked", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Challenge button clicked", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}
