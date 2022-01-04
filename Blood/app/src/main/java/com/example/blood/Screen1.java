package com.example.blood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Screen1 extends AppCompatActivity {
ImageView fingerprint, share_us , more_apps,bar,plus;
Intent i=null,chooser=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);
        fingerprint =findViewById(R.id.fingerprint);
        share_us =findViewById(R.id.share);
        more_apps =findViewById(R.id.add);
        bar =findViewById(R.id.bar);
        plus=findViewById(R.id.plus);
        fingerprint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bar.setImageResource(R.drawable.bar);
                Thread background = new Thread() {
                    public void run() {
                        try {
                            // Thread will sleep for 5 seconds
                            sleep(3*1000);

                            // After 5 seconds redirect to another intent
                            Intent i=new Intent(getBaseContext(),Screen2.class);
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
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://play.google.com/?hl=en?"));
                chooser=Intent.createChooser(i,"Open Playstore");
                startActivity(chooser);
            }
        });
    }
}