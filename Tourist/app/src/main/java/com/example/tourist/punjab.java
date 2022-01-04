package com.example.tourist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class punjab extends AppCompatActivity {
    CardView card1,card2,card3;
    TextView learn1,learn2,learn3;
    ImageView image1,image2,image3;
    CheckBox box1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punjab);
        learn1=findViewById(R.id.learn1);
        learn2=findViewById(R.id.learn2);
        learn3=findViewById(R.id.learn3);
        card1=findViewById(R.id.card1);
        card2=findViewById(R.id.card2);
        card3=findViewById(R.id.card3);
        image1=findViewById(R.id.image1);
        image2=findViewById(R.id.image2);
        image3=findViewById(R.id.image3);
        box1=findViewById(R.id.box1);
        learn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }

        });
        box1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(box1.isChecked())
                {
                    Toast.makeText(getApplicationContext(), "Check 1", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}