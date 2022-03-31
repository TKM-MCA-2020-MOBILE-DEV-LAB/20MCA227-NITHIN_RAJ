package com.example.optionsmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

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
        inflater.inflate(R.menu.option_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.about_id)
        {
            Intent i = new Intent(MainActivity.this,about.class);
            startActivity(i);
        }
        if(id == R.id.image)
        {
            Intent i = new Intent(MainActivity.this,image.class);
            startActivity(i);
        }
        if(id == R.id.image2)
        {
            Intent i = new Intent(MainActivity.this,image2.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}