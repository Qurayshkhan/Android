package com.example.currenttime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     }

        public void getCurrentTime(View view) {
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
            String strDate = "Current Time : " + format.format(calendar.getTime());
            display(strDate);
        }

        private void display(String num) {
            TextView textView = (TextView) findViewById(R.id.current_time_view);
            textView.setText(num);
    }
}