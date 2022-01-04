package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual,rt;
    EditText EditText;
    TextView text;

    float mValueOne, mValueTwo;

    boolean Addition, mSubtract, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.b10);
        buttonAdd = (Button) findViewById(R.id.add);
        buttonSub = (Button) findViewById(R.id.sub);
        buttonMul = (Button) findViewById(R.id.mul);
        buttonDivision = (Button) findViewById(R.id.div);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.eql);
        EditText = (EditText) findViewById(R.id.edt1);
        text=(TextView) findViewById(R.id.text);
        rt = (Button) findViewById(R.id.rbtn);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditText.length() == 0) {
                    EditText.setText(EditText.getText() + "1");
                    text.setText(EditText.getText());
                }
                else{

                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "2");
                text.setText(EditText.getText());

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "3");
                text.setText(EditText.getText());
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "4");
                text.setText(EditText.getText());
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "5");
                text.setText(EditText.getText());
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "6");
                text.setText(EditText.getText());
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "7");
                text.setText(EditText.getText());
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "8");
                text.setText(EditText.getText());
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "9");
                text.setText(EditText.getText());
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "0");
                text.setText(EditText.getText());
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (EditText == null) {
                    EditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(EditText.getText() + "");
                    Addition = true;
                    EditText.setText(null);
                    text.setText(text.getText()+ "+");
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(EditText.getText() + "");
                mSubtract = true;
                EditText.setText(null);
                text.setText(text.getText()+ "-");
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(EditText.getText() + "");
                Multiplication = true;
                EditText.setText(null);
                text.setText(text.getText()+ "x");
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(EditText.getText() + "");
                Division = true;
                EditText.setText(null);
                text.setText(text.getText()+"/");
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(EditText.getText() + "");

                if (Addition == true) {
                    EditText.setText(mValueOne + mValueTwo + "");
                    text.setText(mValueOne + mValueTwo + "");
                    Addition = false;
                }

                if (mSubtract == true) {
                    EditText.setText(mValueOne - mValueTwo + "");
                    text.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (Multiplication == true) {
                    EditText.setText(mValueOne * mValueTwo + "");
                    text.setText(mValueOne * mValueTwo + "");
                    Multiplication = false;
                }

                if (Division == true) {
                    EditText.setText(mValueOne / mValueTwo + "");
                    text.setText(mValueOne / mValueTwo + "");
                    Division = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText("");
                text.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + ".");
                text.setText(EditText.getText());

            }
        });
        rt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Rate.class);
                startActivity(i);
            }
        });
    }
}