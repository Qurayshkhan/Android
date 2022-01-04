package com.example.moodscanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=findViewById(R.id.txt1);


                /****** Create Thread that will sleep for 5 seconds****/
                Thread background = new Thread() {
                    public void run() {
                        try {
                            // Thread will sleep for 5 seconds
                            sleep(5*1000);

                            // After 5 seconds redirect to another intent
                            Intent i=new Intent(getBaseContext(),Screen1.class);
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

}