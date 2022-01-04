package com.example.login;

import android.content.Intent;
import android.os.Bundle;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity  {
    Button b1;
    EditText ed1,ed2;

    TextView tx1,tv2,fpass;
    int counter = 3;
    String s,s1;
    String u= "usama";
    String p= "asdfasdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.button);
        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText2);
        tx1 = (TextView)findViewById(R.id.textView3);
        tx1.setVisibility(View.GONE);
        fpass=findViewById(R.id.fpass);
        tv2=findViewById(R.id.tv2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals(u) &&
                        ed2.getText().toString().equals(p)) {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting...",Toast.LENGTH_LONG).show();
                    Intent i= new Intent(MainActivity.this,Home.class);
                    s= ed1.getText().toString();
                    i.putExtra("v1",s);
                    startActivity(i);
                }
                else
                    {
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();

                            tx1.setVisibility(View.VISIBLE);
                    tx1.setBackgroundColor(Color.RED);
                    counter--;
                    tx1.setText(Integer.toString(counter));

                    if (counter == 0) {
                        b1.setEnabled(false);
                        new CountDownTimer(30000, 1000) {

                            public void onTick(long millisUntilFinished) {
                                tv2.setText("Login Button will enabled after: " + millisUntilFinished / 1000);
                            }

                            public void onFinish() {
                                tx1.setVisibility(View.INVISIBLE);
                                tv2.setVisibility(View.INVISIBLE);
                                counter=3;
                                b1.setEnabled(true);
                            }
                        }.start();
                    }
                }
            }
        });
        fpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Reset.class);
                startActivity(intent);
            }
        });

//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                finish();
//            }
//        });
    }
}
