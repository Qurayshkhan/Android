package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.transition.Slide;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= findViewById(R.id.btn
        );
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(MainActivity.this, "bbb", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.TOP | Gravity.CENTER_VERTICAL,0,0);
                toast.show();
            }
        });
    }
}