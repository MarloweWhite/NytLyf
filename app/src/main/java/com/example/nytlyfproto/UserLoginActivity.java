package com.example.nytlyfproto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;

public class UserLoginActivity extends AppCompatActivity {

    Button userlogin;
    EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        userlogin = findViewById(R.id.userLoginButton);
        email = findViewById(R.id.userLoginEmail);
        password = findViewById(R.id.userLoginPassword);

        //Onclick evemts

        userlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
