package com.example.rating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RatingBar rate;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btn=findViewById(R.id.btn);
    rate=findViewById(R.id.rate);
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
    }
}