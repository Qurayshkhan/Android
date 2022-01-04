package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home extends AppCompatActivity {
TextView text2;
Button btn;
String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        text2=findViewById(R.id.text2);
        btn=findViewById(R.id.btn);
        s=getIntent().getExtras().getString("v1");
        text2.setText(s);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}