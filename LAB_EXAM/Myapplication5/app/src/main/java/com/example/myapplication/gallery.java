package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class gallery extends AppCompatActivity {
    String [] names = {"Simpsons","Snoopy"};
    int logo[] = {R.drawable.snoopy,R.drawable.simpsons};
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        GridView gv = findViewById(R.id.grid);
        gv.setAdapter(new ImageAdapter(this));
        builder = new AlertDialog.Builder(this);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                builder.setMessage("Do you want to delete this image -"+String.valueOf(names[i])).setCancelable(false).setPositiveButton("ok",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){}
                });
                AlertDialog alert = builder.create();
                alert.setTitle("");
                alert.show();
            }
        });
    }
}