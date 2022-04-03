package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        return super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.id1)
        {
            Intent i = new Intent(this,MainActivity2.class);
            startActivity(i);
        }
        if(id==R.id.id2)
        {
            Intent i = new Intent(this,MainActivity3.class);
            startActivity(i);
        }
        if(id==R.id.id3)
        {
            Toast.makeText(this, "Hiiii", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}