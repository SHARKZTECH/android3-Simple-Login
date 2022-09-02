package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginHandler(View v){
        EditText userName=findViewById(R.id.username);
        EditText password=findViewById(R.id.password);
        String name=userName.getText().toString().toLowerCase(Locale.ROOT);
        String pswrd=password.getText().toString();

        if(name.equals("sharkz") && pswrd.equals("password")){
            Intent i=new Intent(this,HomeActivity.class);
            i.putExtra("Name",name);
            startActivity(i);
            Toast.makeText(this,"login successfull!",Toast.LENGTH_LONG).show();
            userName.setText("");
            password.setText("");
        }else{
            Toast.makeText(this,"Incorrect Username or Password",Toast.LENGTH_LONG).show();
        }
    }
}