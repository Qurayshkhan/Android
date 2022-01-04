package com.example.bottomsheets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {
BottomSheetBehavior bottomSheetBehaviour;
Button btn,btn1,btn2;
TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        View bottom= findViewById(R.id.bottom);
        bottomSheetBehaviour=BottomSheetBehavior.from(bottom);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetBehaviour.setState(bottomSheetBehaviour.STATE_EXPANDED);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetBehaviour.setState(bottomSheetBehaviour.STATE_COLLAPSED);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetBehaviour.setState(bottomSheetBehaviour.STATE_HIDDEN);
            }
        });
        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Screen1.class);
                startActivity(i);
            }
        });
    }
}