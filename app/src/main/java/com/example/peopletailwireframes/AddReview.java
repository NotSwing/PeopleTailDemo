package com.example.peopletailwireframes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddReview extends AppCompatActivity {


    private Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_review);

        button1 = (Button) findViewById(R.id.add_retailers);
        button2 = (Button) findViewById(R.id.btn_publish);

        button1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           SecondActivity();
                                       }
                                   }
        );


    }

    public void SecondActivity(){

        Intent intent = new Intent(this, AddRetailers.class);

        startActivity(intent);
    }

    public void publish (View view){

        Intent intent = new Intent(AddReview.this, ReviewPage.class);
        startActivity(intent);
    }


}

