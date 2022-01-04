package com.example.moodscanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class Screen3 extends AppCompatActivity {
ImageView mood,try_again,share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        mood=findViewById(R.id.mood);
        share=findViewById(R.id.share);
        try_again=findViewById(R.id.try_again);
        int [] image ={R.drawable._1,R.drawable._2,R.drawable._3,R.drawable._4,R.drawable._5,R.drawable._6,R.drawable._7,R.drawable._8,R.drawable._9,R.drawable._10,R.drawable._11,R.drawable._12,R.drawable._13,R.drawable._14,R.drawable._15,R.drawable._16,R.drawable._17,R.drawable._18,R.drawable._19,R.drawable._20,R.drawable._21,R.drawable._22,R.drawable._23,R.drawable._24,R.drawable._25,R.drawable._26,R.drawable._27,
                R.drawable._28,R.drawable._29,R.drawable._30,R.drawable._31,R.drawable._32,R.drawable._33,R.drawable._34,R.drawable._35,R.drawable._36,R.drawable._37,R.drawable._38,R.drawable._39,R.drawable._40,R.drawable._41,R.drawable._42,R.drawable._43,R.drawable._44,R.drawable._45,R.drawable._46,R.drawable._47,R.drawable._48,R.drawable._49,R.drawable._50};
        Random random =new Random();
        mood.setImageResource(image[random.nextInt(image.length)]);
        try_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Screen3.this,Screen1.class);
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