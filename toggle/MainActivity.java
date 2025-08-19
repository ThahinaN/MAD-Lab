package com.example.toggle_image;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
ImageView i1,i2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find the ImageView elements by their IDs
        i1=findViewById(R.id.img1);
        i2=findViewById(R.id.img2);
        //Set click listeners for te ImageViews
        i1.setOnClickListener(this);
        i2.setOnClickListener(this);
    }
    public void onClick(View view){
        if(view.getId()==R.id.img1){
            i1.setVisibility(view.GONE);
            i2.setVisibility(view.VISIBLE);
        }
        else{
            i2.setVisibility(view.GONE);
            i1.setVisibility(view.VISIBLE);
        }
    }
}