package com.example.peopletailwireframes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignInFail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_fail);

    }

    public void onClick(View view){

        switch (view.getId()){
            case R.id.button3:

                Intent intent1 = new Intent(SignInFail.this,SignIn.class);

                startActivity(intent1);

                break;

            case R.id.button4:
                Intent intent2 = new Intent(SignInFail.this,RestPassword.class);

                startActivity(intent2);
                break;

        }


    }

}
