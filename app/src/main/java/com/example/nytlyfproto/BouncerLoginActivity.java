package com.example.nytlyfproto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BouncerLoginActivity extends AppCompatActivity {

    Button login;
    EditText loginnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bouncer_login);

        login = findViewById(R.id.bouncerLogin);
        loginnumber = findViewById(R.id.bouncerLoginNumber);

        //onclick events

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
