package com.example.adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    String list[];
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        lv = findViewById(R.id.lv);
        list = new String[]{"Chandler Bing","Joey Tribbiani","Ross Geller","Rachel Green","Monica Geller","Phoebe Buffay","Aravindan","Chandu","Chackachamparambil Joy","Padmini","Chackachamparambil Lasar","Madhava Varma"};
        try {
            ArrayAdapter<String> myAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, list);
            lv.setAdapter(myAdapter);
        }catch (Exception e){
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_LONG).show();
            tv.setText(e.getMessage());
        }
//        tv = findViewById(R.id.textView);
//        try {
//            tv.setText("Hello World");
//        }catch (Exception e){
//            Toast.makeText(this,e.getMessage(),Toast.LENGTH_LONG).show();
//        }

    }
}