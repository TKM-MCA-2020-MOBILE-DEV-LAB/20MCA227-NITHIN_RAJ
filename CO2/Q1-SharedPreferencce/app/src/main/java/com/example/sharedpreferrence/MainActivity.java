package com.example.sharedpreferrence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2,et3;
    String name,place,phone;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.name);
        et2 = findViewById(R.id.place);
        et3 = findViewById(R.id.phone);
        b1 = findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                run();
            }
        });
    }
    protected void onResume()
    {
        super.onResume();
        SharedPreferences sh = getSharedPreferences("MySharedPreference",MODE_PRIVATE);
        String str1 = sh.getString("name","name");
        String str2 = sh.getString("place","place");
        String str3 = sh.getString("phone","phone");
        et1.setText(str1);
        et2.setText(str2);
        et3.setText(str3);
    }
    protected void onPause()
    {
        super.onPause();
        SharedPreferences sh2 = getSharedPreferences("MySharedPreference",MODE_PRIVATE);
        SharedPreferences.Editor myedit = sh2.edit();
        myedit.putString("name",et1.getText().toString());
        myedit.putString("place",et2.getText().toString());
        myedit.putString("phone",et3.getText().toString());
        myedit.apply();
    }
    public void run()
    {
        name = et1.getText().toString();
        place = et2.getText().toString();
        phone = et3.getText().toString();
        Intent i = new Intent(getApplicationContext(),MainActivity2.class);
        i.putExtra("1",name);
        i.putExtra("2",place);
        i.putExtra("3",phone);
        startActivity(i);
    }
}