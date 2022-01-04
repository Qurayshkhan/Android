package com.example.services;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
EditText time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        time=findViewById(R.id.time);
        registerReceiver(broacastReceiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar= Calendar.getInstance();
                int hour=calendar.get(Calendar.HOUR_OF_DAY);
                int minut = calendar.get(Calendar.MINUTE);
                TimePickerDialog timePickerDialog;
                timePickerDialog =new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {
                        time.setText(i+":"+i1);
                    }
                },hour,minut,true);
                timePickerDialog.setTitle("Choose Time");
                timePickerDialog.show();
            }
        });

    }
//    private BroadcastReceiver broadcastReceiver= new BroadcastReceiver() {
//        @Override
//        public void onReceive(Context context, Intent intent) {
//            int level=intent.getIntExtra("level",0);
//            ProgressBar progress=findViewById(R.id.progress);
//            TextView view=findViewById(R.id.view);
//            view.setText("Bettery Level"+Integer.toString(level)+"%");
//            progress.setProgress(level);
//        }
//    };
    private BroadcastReceiver broacastReceiver=new BroadcastReceiver() {
    @Override
    public void onReceive(Context context, Intent intent) {
                    int level=intent.getIntExtra("level",0);
            ProgressBar progress=findViewById(R.id.progress);
            TextView view=findViewById(R.id.view);
            view.setText("Bettery Level"+Integer.toString(level)+"%");
            progress.setProgress(level);
            if (level%2==0)
            {
                TextView view1=findViewById(R.id.view1);
                view1.setText("Bettery in the Even No");
            }
            else
            {
                TextView view1=findViewById(R.id.view1);
                view1.setText("Bettery in the Odd No");
            }
    }
};
}