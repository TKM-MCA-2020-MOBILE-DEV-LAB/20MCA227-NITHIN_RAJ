package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login(View view)
    {
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        if(username.getText().toString().equals("Nithin") && password.getText().toString().equals("1234"))          //Validation
        {
            toast = Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_SHORT);
            toast.show();
        }
        else
        {
            toast = Toast.makeText(getApplicationContext(),"Login Failed",Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}