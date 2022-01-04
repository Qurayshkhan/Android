package com.example.moodscanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Screen1<a> extends AppCompatActivity {
ImageView male,female,scan,share,feed;
int  a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);
        male=findViewById(R.id.male);
        female=findViewById(R.id.female);
        scan=findViewById(R.id.scan);
        share=findViewById(R.id.share);
        feed=findViewById(R.id.feed);
        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=1;
                b=0;
                male.setImageResource(R.drawable.male_select);
                female.setImageResource(R.drawable.female_unslelect);
            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                b=1;
                female.setImageResource(R.drawable.female_select);
                male.setImageResource(R.drawable.male_unselect);
            }
        });

        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a==1||b==1)
                {
                    Intent i= new Intent(Screen1.this,Screen2.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Please Select Gender", Toast.LENGTH_SHORT).show();
                }
            }
        });
        feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Screen1.this,Rate.class);
                startActivity(i);
            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent share=new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                String sharelink="here is the link of the Application";
                share.putExtra(Intent.EXTRA_SUBJECT,"SUBJECT");
                share.putExtra(Intent.EXTRA_TEXT,"sharelink");
                startActivity(Intent.createChooser(share,"share through apps"));
            }
        });
    }
}