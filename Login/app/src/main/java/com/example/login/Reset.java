package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Reset extends AppCompatActivity {
EditText edt;
TextView text;
Button btn,btn2;
String n="03024516371";
String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset);
        edt=findViewById(R.id.edt);
        btn=findViewById(R.id.btn);
        btn2=findViewById(R.id.btn2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edt.getText().toString().equals(n))
                {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting...",Toast.LENGTH_SHORT).show();
                    Intent i= new Intent(Reset.this,Home.class);
                    s= edt.getText().toString();
                    i.putExtra("v1",s);
                    startActivity(i);
                }
                else
                    {
                    Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
                    }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Reset.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}