package com.example.slider;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.os.Bundle;
//import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import android.widget.ViewSwitcher.ViewFactory;

public class MainActivity extends AppCompatActivity {
    private static Button next;
    private static TextSwitcher textswitcher;
    private static ImageSwitcher imgswitch;

    // String array to be shown on textSwitcher
    String textToShow[] = { "Expect the best, Prepare for the worst.",
            "Do right. Do your best. Treat others as you want to be treated.",
            "The best way to predict the future is to create it.",
            "To give anything less than your best, is to sacrifice the gift.",
            "The best revenge is massive success." ,"Success is not a good teacher, failure makes you humble." };
    int [] image ={R.drawable._1,R.drawable._2,R.drawable._3,R.drawable._4,R.drawable._5};

    // Total length of the string array
    int messageCount = textToShow.length;
    int messageCount1 = image.length;
    // to keep current Index of text
    int currentIndex = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Call all the methods
        init();
        loadAnimations();
        setFactory();
//        setFactory1();
        setListener();
    }

    void init() {
        next = (Button) findViewById(R.id.buttonNext);
        textswitcher = (TextSwitcher) findViewById(R.id.textSwitcher);
        imgswitch = (ImageSwitcher) findViewById(R.id.image);


    }

    void loadAnimations() {

        // Declare the in and out animations and initialize them
        Animation in = AnimationUtils.loadAnimation(this,
                android.R.anim.slide_in_left);
        Animation out = AnimationUtils.loadAnimation(this,
                android.R.anim.slide_out_right);

        // set the animation type of textSwitcher
        textswitcher.setInAnimation(in);
        textswitcher.setOutAnimation(out);
//        imageswitcher.setInAnimation(in);
//        imageswitcher.setOutAnimation(out);
    }

    // Click listener method for button
    void setListener() {

        // ClickListener for NEXT button
        // When clicked on Button TextSwitcher will switch between texts
        // The current Text will go OUT and next text will come in with
        // specified animation
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                currentIndex++;
                // If index reaches maximum reset it
                if (currentIndex == messageCount)
                    currentIndex = 0;

                // Set the textSwitcher text and imageSwitcher image according to current index from
                textswitcher.setText(textToShow[currentIndex]);
                imgswitch.setImageResource(image[currentIndex]);
            }
        });
    }

    // Set Factory for the textSwitcher *Compulsory part
    void setFactory() {
        textswitcher.setFactory(new ViewFactory() {

            public View makeView() {

                // Create run time textView with some attributes like gravity,
                // color, etc.
                TextView myText = new TextView(MainActivity.this);
                myText.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL);
                myText.setTextSize(30);
                myText.setTextColor(Color.RED);
                return myText;
            }
        });
        imgswitch = (ImageSwitcher) findViewById(R.id.image);
        imgswitch.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imgVw= new ImageView(MainActivity.this);
                imgVw.setImageResource(image[currentIndex]);
                return imgVw;
            }
        });

    }
}