package com.example.peopletailwireframes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_main);
    }

    public void onClick(View view){
        Intent intent = new Intent(SignUpMain.this, SignIn.class);
        startActivity(intent);


    }
}
