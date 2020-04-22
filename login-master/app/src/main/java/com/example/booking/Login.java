package com.example.booking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView textView1 = findViewById(R.id.txtfogt);
        TextView regtext = findViewById(R.id.reg);
        Button button = findViewById(R.id.btnlog);
        final EditText user = findViewById(R.id.username);
        final EditText pass = findViewById(R.id.password);


        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Password_Reset.class);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pass != null && user != null) {
                    Intent intent = new Intent(getApplicationContext(), Places.class);
                    startActivity(intent);
                }
                else{

                }
            }
        });

        regtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,Register.class);
                startActivity(intent);
            }
        });
    }
}
