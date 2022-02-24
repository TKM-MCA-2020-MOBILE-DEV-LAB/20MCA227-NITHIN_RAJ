package com.example.listview;

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
        list = new String[]{"Spider-Man","Batman","Ironman","Doctor Strange","Black Panther","Flash","Moon Knight","Hulk","Captain America","Hawkeye","Black Widow","Loki","Thor","Ant-Man","Wanda","Vision","Deadpool","Joker","Harley Quinn","Deadshot","Deathstroke"};
        try {
            ArrayAdapter<String> myAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, list);
            lv.setAdapter(myAdapter);
        }catch (Exception e){
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_LONG).show();
//            tv.setText(e.getMessage());
        }
        tv = findViewById(R.id.textView);
        try {
            tv.setText("Hello World");
        }catch (Exception e){
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_LONG).show();
        }

    }
}