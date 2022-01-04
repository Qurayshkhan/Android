package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
ImageView dice;
int rand;
int min,max;
TextView txt;
CardView card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        dice=findViewById(R.id.dice);
        txt=findViewById(R.id.txt);
        card=findViewById(R.id.card);
        txt.setText(String.valueOf(6));
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random=new Random();

//                int [] image ={R.drawable.first1,R.drawable.second2,R.drawable.third3,R.drawable.fourth4,R.drawable.five5,R.drawable.six6};
//                Random random =new Random();
//                dice.setImageResource(image[random.nextInt(image.length)]);
                rand = random.nextInt(7 - 1) + 1;;
                txt.setText(String.valueOf(rand));


            }
        });
    }
}