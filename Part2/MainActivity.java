package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button bAdd, bSub, bDiv, bMult, decimal, reset, bEqual;
    TextView text;

    float val1, val2;
    boolean addition, subtraction, multiplication, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);



        b0 = (Button) findViewById(R.id.b0);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "0");
            }
        });



        b1 = (Button) findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "1");
            }
        });



        b2 = (Button) findViewById(R.id.b2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "2");
            }
        });



        b3 = (Button) findViewById(R.id.b3);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "3");
            }
        });



        b4 = (Button) findViewById(R.id.b4);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "4");
            }
        });



        b5 = (Button) findViewById(R.id.b5);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "5");
            }
        });



        b6 = (Button) findViewById(R.id.b6);

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "6");
            }
        });



        b7 = (Button) findViewById(R.id.b7);

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "7");
            }
        });



        b8 = (Button) findViewById(R.id.b8);

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "8");
            }
        });



        b9 = (Button) findViewById(R.id.b9);

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "9");
            }
        });



        decimal = (Button) findViewById(R.id.decimal);

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + ".");
            }
        });



        bAdd = (Button) findViewById(R.id.bAdd);

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (text == null) {
                    text.setText("");
                } else {
                    val1 = Float.parseFloat(text.getText() + "");
                    addition = true;
                    text.setText(null);
                }
            }
        });



        bSub = (Button) findViewById(R.id.bSub);

        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text == null) {
                    text.setText("");
                }
                else {
                    val1 = Float.parseFloat(text.getText() + "");
                    subtraction = true;
                    text.setText(null);
                }
            }
        });



        bMult = (Button) findViewById(R.id.bMult);

        bMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text == null){
                    text.setText("");
                } else {
                    val1 = Float.parseFloat(text.getText() + "");
                    multiplication = true;
                    text.setText(null);
                }
            }
        });



        bDiv = (Button) findViewById(R.id.bDiv);

        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text == null){
                    text.setText("");
                } else {
                    val1 = Float.parseFloat(text.getText() + "");
                    division = true;
                    text.setText(null);
                }
            }
        });



        reset = (Button) findViewById(R.id.reset);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("");
            }
        });



        bEqual = (Button) findViewById(R.id.bEqual);

        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2 = Float.parseFloat(text.getText() + "");

                if (addition == true) {
                    text.setText(val1 + val2 + "");
                    addition = false;
                }

                if (subtraction == true) {
                    text.setText(val1 - val2 + "");
                    subtraction = false;
                }

                if (multiplication == true) {
                    text.setText(val1 * val2 + "");
                    multiplication = false;
                }

                if (division == true) {
                    text.setText(val1 / val2 + "");
                    division = false;
                }
            }
        });

    }
}

