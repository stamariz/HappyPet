package com.example.happypet.happypet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvSignUp,tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSignUp = (TextView)findViewById(R.id.tvSignUp);
        tvRegister = (TextView)findViewById(R.id.tvRegister);

        tvSignUp.setOnClickListener(onRegisterSignUpClickListener);
        tvRegister.setOnClickListener(onRegisterClickListener);

    }
    View.OnClickListener onRegisterClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onRegisterSignUpClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
            startActivity(intent);
        }
    };




}
