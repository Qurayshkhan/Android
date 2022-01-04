package com.example.moodscanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

public class Rate extends AppCompatActivity {
RatingBar rate;
ImageView ratebtn,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        rate=findViewById(R.id.rate);
        ratebtn=findViewById(R.id.ratebtn);
        back=findViewById(R.id.back);
        ratebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float value= rate.getRating();
                if (value==5.0){
                    Toast.makeText(getApplicationContext(), "Excellent Ratting "+value, Toast.LENGTH_SHORT).show();
                }
                else if (value==4 || value==4.5)
                {
                    Toast.makeText(getApplicationContext(), "Satisfactory Ratting "+value , Toast.LENGTH_SHORT).show();
                }
                else if (value==3 || value==3.5)
                {
                    Toast.makeText(getApplicationContext(), "Good Ratting "+value, Toast.LENGTH_SHORT).show();
                }
                else if (value==2 || value==2.5)
                {
                    Toast.makeText(getApplicationContext(), "Normal Ratting "+value, Toast.LENGTH_SHORT).show();
                }
                else if (value==1 || value==1.5)
                {
                    Toast.makeText(getApplicationContext(), "Ratting"+value, Toast.LENGTH_SHORT).show();
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Rate.this,Screen1.class);
                startActivity(i);
            }
        });
    }
}