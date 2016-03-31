package com.example.happypet.happypet;

import android.content.Intent;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import utils.Constants;

/**
 * Created by Alejandro on 31/03/2016.
 */
public class LoginActivity extends AppCompatActivity {
    private EditText etUsername,etPassword;
    private TextView tvLogIn;

    /**
     * Metodo que se llama al iniciar la aplicación
     * Aqui va todo lo que quieras setear antes de inicializar la pantalla
     * @param savedInstanceState recibe los datos que se guardan al restaurar la vista, no lo usamos por ahora
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Este metodo es el que vincula el layout activity_main con la clase MainActivity
        setContentView(R.layout.activity_main_signup);
        //Proseguimos con inicializar las vistas del xml en nuestras variables
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        tvLogIn = (TextView) findViewById(R.id.tvLogIn);
        //Aplicamos el evento onClick para el boton
        tvLogIn.setOnClickListener(onDoneClickListener);
    }

    View.OnClickListener onDoneClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(etUsername.getText().toString().trim() != "" && etPassword.getText().toString().trim() != ""){
                Intent intent = new Intent(LoginActivity.this,ResultActivity.class);
                intent.putExtra(Constants.PARAM_NAME,etUsername.getText().toString().trim());
                startActivity(intent);
            }
        }
    };



}
