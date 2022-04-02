package com.example.q3_explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText Name;
    EditText address;
    EditText email;
    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.s1);
        address = findViewById(R.id.s2);
        email = findViewById(R.id.s3);
        Submit = findViewById(R.id.b1);

    }

    public void callSecondActivity(View view) {
        Intent i = new Intent(getApplicationContext(), MainActivity2.class);
        String str = "Name     :         "+ Name.getText().toString();
        i.putExtra("Value1", str);
        String str1 ="Address  :         "+ address.getText().toString();
        i.putExtra("Value2", str1);
        String str2 = "Email   :         "+ email.getText().toString();
        i.putExtra("Value3", str2);

        startActivity(i);
    }
}