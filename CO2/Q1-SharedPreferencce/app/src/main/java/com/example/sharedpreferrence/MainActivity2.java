package com.example.sharedpreferrence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras = getIntent().getExtras();
        t1 = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView2);
        t3 = findViewById(R.id.textView3);
        String value1 = extras.getString("1");
        String value2 = extras.getString("2");
        String value3 = extras.getString("3");
        System.out.println("///////////////////////////////////"+value1);
        t1.setText("Name: "+value1);
        t2.setText("Place: "+value2);
        t3.setText("Phone: "+value3);
    }
    public void callFirstActivity(View view){
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
    }

}