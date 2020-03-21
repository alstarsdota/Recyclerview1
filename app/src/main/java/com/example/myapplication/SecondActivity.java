package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity{

    ImageView image;
    TextView textView;
    boolean like=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        image = findViewById(R.id.myImageVIEW);
        textView = findViewById(R.id.description);

        String desc = getIntent().getStringExtra("data1");
        int imID = getIntent().getIntExtra("image", 0);

        image.setImageResource(imID);

        textView.setText(desc);
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
