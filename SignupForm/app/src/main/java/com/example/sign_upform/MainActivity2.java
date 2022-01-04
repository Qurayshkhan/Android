package com.example.sign_upform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {
Button btn;
TextView fname,lname,num,dob,time;
String str1,str2,str3,str4,str5,str6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        fname = findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
        num = findViewById(R.id.num);
        dob = findViewById(R.id.dob);
        time=findViewById(R.id.time);
        str1 = getIntent().getExtras().getString("v1");
        str2 = getIntent().getExtras().getString("v2");
        str3 = getIntent().getExtras().getString("v3");
        str4 = getIntent().getExtras().getString("v4");
        str5 = getIntent().getExtras().getString("v5");
        fname.setText(str1);
        lname.setText(str2);
        num.setText(str3);
        dob.setText(str4);
        time.setText(str5);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}