package com.example.peopletailwireframes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
<<<<<<< Updated upstream
import android.view.Menu;
import android.view.MenuItem;
=======
>>>>>>> Stashed changes
import android.view.View;

public class SignUpSignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_sign_in);
    }
<<<<<<< Updated upstream
    public void SignIn(View view)
    {
        startActivity(new Intent(SignUpSignIn.this, ReviewPage.class));
    }


=======


    public void onClick(View view){

        switch (view.getId()){
            case R.id.button:

                Intent intent1 = new Intent(SignUpSignIn.this,SignIn.class);

                startActivity(intent1);

                break;

            case R.id.SignIn:
                Intent intent2 = new Intent(SignUpSignIn.this,SignUpMain.class);

                startActivity(intent2);
                break;

        }


    }

>>>>>>> Stashed changes
}
