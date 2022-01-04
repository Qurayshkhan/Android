package com.example.sign_upform;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;


import com.example.sign_upform.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {


    DatePickerDialog picker;
    Button btn1;
    EditText fname, lname, num, dob;
    TextView time;
    RadioGroup gr;
    RadioButton male, female;
    Boolean checked;
    String s1, s2, s3, s4,s5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        fname = findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
        num = findViewById(R.id.num);
        gr = findViewById(R.id.gr);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        dob = findViewById(R.id.dob);
        dob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);
                // date picker dialog
                picker = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                dob.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                                dob.setTextColor(Color.BLACK);
                            }
                        }, year, month, day);
                picker.show();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


//                Toast.makeText(getApplicationContext(), "Signed-Up Succesfully", Toast.LENGTH_LONG).show();
                if (fname.length() == 0 || lname.length() == 0 || num.length() == 0 || dob.length() == 0) {
                    Toast.makeText(getApplicationContext(), "All Fields are required", Toast.LENGTH_LONG).show();

                } else if (fname.length() < 3 || fname.length() > 11) {
                    Toast.makeText(getApplicationContext(), "First name must be 3 to 11 characters", Toast.LENGTH_LONG).show();

                } else if (lname.length() < 3 || lname.length() > 11) {
                    Toast.makeText(getApplicationContext(), "Last name must be 3 to 11 characters", Toast.LENGTH_LONG).show();

                } else if (num.length() < 11 || num.length() > 11) {
                    Toast.makeText(getApplicationContext(), " Phone Number must be 11 digits", Toast.LENGTH_LONG).show();

                } else {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    Date currentTime = Calendar.getInstance().getTime();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("hh.mm.ss aa");
                    String output = dateFormat.format(currentTime);
//                    time.setText(output);
                    s1 = fname.getText().toString();
                    s2 = lname.getText().toString();
                    s3 = num.getText().toString();
                    s4 = dob.getText().toString();
//                    s5= time.getText().toString();
                    intent.putExtra("v1", s1);
                    intent.putExtra("v2", s2);
                    intent.putExtra("v3", s3);
                    intent.putExtra("v4", s4);
                    intent.putExtra("v5", output);
                    startActivity(intent);

                    Toast.makeText(getApplicationContext(), "Signed-Up Succesfully", Toast.LENGTH_LONG).show();
                }

            }

        });

    }
}