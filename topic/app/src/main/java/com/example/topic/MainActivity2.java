package com.example.topic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView textView;
Button btnback;
String valfromact1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.text);
        btnback = findViewById(R.id.btnback);
        valfromact1 = getIntent().getExtras().getString("value");
        textView.setText(valfromact1);

    }
}