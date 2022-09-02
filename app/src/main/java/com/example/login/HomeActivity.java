package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView txt=findViewById(R.id.text);
        Intent i=getIntent();
        String name=i.getStringExtra("Name");
        txt.setText("Welcome"+" "+name);
    }
}