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

    public void onClick(View view){

        if(true/* sign in is successfull*/){
            Intent intent = new Intent(SignIn.this, PeopleTailMainView.class);
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(SignIn.this, SignInFail.class);
            startActivity(intent);
        }

    }
}
