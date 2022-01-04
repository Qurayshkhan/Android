package com.example.guess;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Integer rand,a;
    Button btn;
EditText ed1;
TextView txt1,txt2;
String s1;
ImageView img;
RelativeLayout main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        ed1=findViewById(R.id.ed1);
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        img=findViewById(R.id.img);
        main=findViewById(R.id.main);

      btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              if (ed1.length()==0){
                  Toast.makeText(getApplicationContext(), "Enter A number", Toast.LENGTH_SHORT).show();
              }
              else {
                  Random random = new Random();
                  rand = random.nextInt(10 - 1) + 1;
                  ;
                  s1 = ed1.getText().toString();
                  txt1.setText(s1);
                  txt2.setText(String.valueOf(rand));
                  a = Integer.parseInt(ed1.getText().toString());
                  if (rand < a) {
                      img.setImageResource(R.drawable.lose);
                      main.setBackgroundColor(Color.rgb(250, 128, 114));
                      Toast.makeText(getApplicationContext(), "You Enter Greater Number", Toast.LENGTH_SHORT).show();
                  } else if (rand > a) {
                      img.setImageResource(R.drawable.lose);
                      main.setBackgroundColor(Color.rgb(250, 128, 114));

                      Toast.makeText(getApplicationContext(), "You Enter Lower Number", Toast.LENGTH_SHORT).show();
                  } else if (rand == a) {
                      img.setImageResource(R.drawable.win);
                      main.setBackgroundColor(Color.rgb(60, 179, 113));
                      Toast.makeText(getApplicationContext(), "You Win", Toast.LENGTH_SHORT).show();
                  }
              }

          }
      });

    }
}