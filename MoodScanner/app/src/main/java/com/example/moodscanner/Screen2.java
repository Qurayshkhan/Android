package com.example.moodscanner;

import static com.example.moodscanner.R.drawable.bg_while_scanning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Random;

public class Screen2 extends AppCompatActivity {
ImageView thumb,scanner;
RelativeLayout main;
ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        thumb=findViewById(R.id.thumb);
        main=findViewById(R.id.scan_main);

        thumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
main.setBackgroundResource(bg_while_scanning);
                /****** Create Thread that will sleep for 5 seconds****/

                Thread background = new Thread() {
                    public void run() {
                        try {
                            // Thread will sleep for 5 seconds
                            sleep(3*1000);

                            // After 5 seconds redirect to another intent
                            Intent i=new Intent(getBaseContext(),Screen3.class);
                            startActivity(i);

                            //Remove activity
                            finish();
                        } catch (Exception e) {
                        }
                    }
                };
                // start thread
                background.start();
            }
        });
    }

    public void btn_action(View view) {
        Animation scroll = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scroll);
        scanner.startAnimation(scroll);
    }
}