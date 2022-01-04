package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class Rate extends AppCompatActivity {
    RatingBar rate;
    Button btn,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        btn=findViewById(R.id.rate);
        back=findViewById(R.id.back);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float value= rate.getRating();
                Toast.makeText(getApplicationContext(), ""+value, Toast.LENGTH_SHORT).show();
                if (value==5.0){
                    Toast.makeText(getApplicationContext(), "Excellent", Toast.LENGTH_SHORT).show();
                }
                else if (value==4 || value==4.5)
                {
                    Toast.makeText(getApplicationContext(), "Satisfactory", Toast.LENGTH_SHORT).show();
                }
                else if (value==3 || value==3.5)
                {
                    Toast.makeText(getApplicationContext(), "Good", Toast.LENGTH_SHORT).show();
                }
                else if (value==2 || value==2.5)
                {
                    Toast.makeText(getApplicationContext(), "Normal", Toast.LENGTH_SHORT).show();
                }
                else if (value==1 || value==1.5)
                {
                    Toast.makeText(getApplicationContext(), ""+value, Toast.LENGTH_SHORT).show();
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Rate.this,MainActivity.class);
                startActivity(i);
            }
        });


    }
}