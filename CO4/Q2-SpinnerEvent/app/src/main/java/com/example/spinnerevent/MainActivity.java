package com.example.spinnerevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = findViewById(R.id.spinner); //Creating a spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.fruits_array, android.R.layout.simple_spinner_item); //Array Adapter maps an array of objects
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); //Dropdown design
        spinner.setAdapter(adapter); //Setting adapter to the spinner
        spinner.setOnItemSelectedListener(this); //Listener
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String str = String.valueOf(adapterView.getItemAtPosition(i));
        Toast toast = Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG);
        toast.show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}