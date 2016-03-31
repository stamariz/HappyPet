package com.example.happypet.happypet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvSignUp,tvLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSignUp = (TextView)findViewById(R.id.tvSignUp);
        tvLogIn = (TextView)findViewById(R.id.tvLogIn);
        tvLogIn.setOnClickListener(onLogInClickListener);

    }
    View.OnClickListener onLogInClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        }
    };




}
