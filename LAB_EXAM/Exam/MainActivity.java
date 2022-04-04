package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText et;
String str,num1,num2;
float n1,n2,ans;
int flag = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.result);
    }

    public void zero(View view)
    {
        str = et.getText().toString();
        et.setText(str+"0");
    }
    public void one(View view)
    {
        str = et.getText().toString();
        et.setText(str+"1");
    }
    public void two(View view)
    {
        str = et.getText().toString();
        et.setText(str+"2");
    }
    public void three(View view)
    {
        str = et.getText().toString();
        et.setText(str+"3");
    }
    public void four(View view)
    {
        str = et.getText().toString();
        et.setText(str+"4");
    }
    public void five(View view)
    {
        str = et.getText().toString();
        et.setText(str+"5");
    }
    public void six(View view)
    {
        str = et.getText().toString();
        et.setText(str+"6");
    }
    public void seven(View view)
    {
        str = et.getText().toString();
        et.setText(str+"7");
    }
    public void eight(View view)
    {
        str = et.getText().toString();
        et.setText(str+"8");
    }
    public void nine(View view)
    {
        str = et.getText().toString();
        et.setText(str+"9");
    }
    public void clear(View view)
    {
        et.setText("");
    }
    public void dot(View view)
    {
        str = et.getText().toString();
        et.setText(str+".");
    }
    public void add(View view)
    {
        flag = 1;
        num1 = et.getText().toString();
        et.setText("");
    }
    public void sub(View view)
    {
        flag = 2;
        num1 = et.getText().toString();
        et.setText("");
    }
    public void mul(View view)
    {
        flag = 3;
        num1 = et.getText().toString();
        et.setText("");
    }
    public void div(View view)
    {
        flag = 4;
        num1 = et.getText().toString();
        et.setText("");
    }
    public void equal(View view)
    {
        num2 = et.getText().toString();
        n1 = Float.parseFloat(num1);
        n2 = Float.parseFloat(num2);
        switch(flag)
        {
            case 1 : ans = n1 + n2;
                     et.setText(String.valueOf(ans));
                     break;
            case 2 : ans = n1 - n2;
                     et.setText(String.valueOf(ans));
                     break;
            case 3 : ans = n1 * n2;
                     et.setText(String.valueOf(ans));
                     break;
            case 4 : ans = n1 / n2;
                     et.setText(String.valueOf(ans));
                     break;
        }
    }
}