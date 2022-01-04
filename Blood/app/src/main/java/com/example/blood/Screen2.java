package com.example.blood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Screen2 extends AppCompatActivity {
TextView txt;
ImageView again;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        txt=findViewById(R.id.txt);
        again=findViewById(R.id.again);
        String [] str ={"AB+","AB-","A+","A-","B+","B-","O-","O+"};
        Random random =new Random();
        txt.setText(str[random.nextInt(str.length)]);
        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Screen2.this,Screen1.class);
                startActivity(i);
            }
        });
    }
}