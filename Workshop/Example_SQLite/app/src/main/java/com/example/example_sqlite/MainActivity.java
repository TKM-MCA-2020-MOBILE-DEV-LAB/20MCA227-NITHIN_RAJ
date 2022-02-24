package com.example.example_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt1,bt2;
    EditText et1,et2;
    Switch switch1;
    customer cust;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        switch1 = findViewById(R.id.switch1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"View All",Toast.LENGTH_SHORT).show();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    cust = new customer(1,Integer.parseInt(et2.getText().toString()),et1.getText().toString(),switch1.isChecked());
//                    Toast.makeText(MainActivity.this,cust.toString(),Toast.LENGTH_SHORT).show();
                    Database db = new Database(MainActivity.this);
                    Boolean success = db.add1(cust);
                    Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_SHORT).show();
                }catch (Exception e){
//                    Database db = new Database(MainActivity.this);
//                    Boolean success = db.add1(cust);
                    Toast.makeText(MainActivity.this,"Error",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}