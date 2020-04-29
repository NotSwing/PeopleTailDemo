package com.example.peopletailwireframes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void forgetPassword (View view){

        Intent intent = new Intent(SignIn.this, RestPassword.class);
        startActivity(intent);
    }

    public void onClick (View view){

        Intent intent = new Intent(SignIn.this, ReviewPage.class);
        startActivity(intent);
    }

    public void facebookLogin (View view){

        Intent intent = new Intent(SignIn.this, ReviewPage.class);
        startActivity(intent);
    }

    public void instagramLogin (View view){

        Intent intent = new Intent(SignIn.this, ReviewPage.class);
        startActivity(intent);
    }
}
