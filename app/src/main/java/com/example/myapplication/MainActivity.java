package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    boolean like=true;

    RecyclerView recyclerview;

    String s1[], s2[];
    int images[]={R.drawable.arman, R.drawable.zhalgas, R.drawable.shavkat, R.drawable.baseball, R.drawable.basketball, R.drawable.billiards,R.drawable.coach,R.drawable.football,R.drawable.box,R.drawable.volleyball};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerview=findViewById(R.id.recyclerView);

        s1=getResources().getStringArray(R.array.descriptions);

        MyAdapter myAdapter = new MyAdapter(this, s1, images);
        recyclerview.setAdapter(myAdapter);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));


    }

    public void toastClick(View view) {
        if(like==true)
        {
            Toast.makeText(this, "Liked", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Unliked", Toast.LENGTH_LONG).show();
        }
        like=!like;
    }
}
