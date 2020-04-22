package com.example.peopletailwireframes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class SignUpSignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_sign_in);
    }
    public void SignIn(View view)
    {
        startActivity(new Intent(SignUpSignIn.this, ReviewPage.class));
    }


}
