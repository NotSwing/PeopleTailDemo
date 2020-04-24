package com.example.peopletailwireframes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class PeopleTailMainView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people_tail_main_view);
    }


    public void onClick(View view){

        switch (view.getId()){
            case R.id.home_button:

                Intent homeintent = new Intent(/*[thisactivity.java],*[homeactivity.class]*/);

                startActivity(homeintent);

                break;

            case R.id.search_button:
                Intent searchintent = new Intent(/*[thisactivity.java],[searchactivity.class]*/);

                startActivity(searchintent);
                break;

            case R.id.profile_button:

                Intent profileintent = new Intent(/*[thisactivity.java],[profileactivity.class]*/);

                startActivity(profileintent);

                break;

        }


    }
}
