package com.example.peopletailwireframes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RestPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest_password);
    }

    public void onClick (View view){

        Intent intent = new Intent(RestPassword.this, SignIn.class);
        startActivity(intent);
    }

    public void onClickSend (View view){
        Toast.makeText(this, "Email sent", Toast.LENGTH_SHORT).show();
    }
}
