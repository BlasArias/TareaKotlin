package com.example.appkotlinblas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    EditText username, password;
    Button btnLogin;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usermane = findViewById<EditText>(R.id.username);
        password = findViewById<EditText>(R.id.password);
        btmLogin = findViewById<Button>(R.id.btnLogin);



    }
}