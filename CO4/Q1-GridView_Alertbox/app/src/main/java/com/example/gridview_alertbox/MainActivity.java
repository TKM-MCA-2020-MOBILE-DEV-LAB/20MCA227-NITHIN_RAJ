package com.example.gridview_alertbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder builder;

    GridView gridView;
    String names[] = {"Mayavi","Luttapi","Kuttoosan","Dankini","Shikari_Shambu","Dinkan"};
    int images[] = {R.drawable.mayavi,R.drawable.luttappi,R.drawable.kuttoosan,R.drawable.dankini,R.drawable.shikari_shambu,R.drawable.dinkan};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        builder = new AlertDialog.Builder(this);
        gridView = findViewById(R.id.grid);
        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                builder.setMessage(String.valueOf(names[i])).setCancelable(false).setPositiveButton("ok",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){}
                });
                AlertDialog alert = builder.create();
                alert.setTitle("");
                alert.show();

            }
        });
    }
    public class CustomAdapter extends BaseAdapter
    {
        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.row_data,null);
            TextView name = view1.findViewById(R.id.comics);
            ImageView image = view1.findViewById(R.id.images);
            name.setText(names[i]);
            image.setImageResource(images[i]);
            return view1;
        }
    }
}