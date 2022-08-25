package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b00,plus,minus,multi,div,equal,dot,ac;
    TextView text_num;
    int fnum,snum;
    char op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        b00 = findViewById(R.id.b00);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multi = findViewById(R.id.multi);
        div = findViewById(R.id.div);
        equal = findViewById(R.id.equal);
        dot = findViewById(R.id.dot);
        ac = findViewById(R.id.ac);
        text_num = findViewById(R.id.text_num);

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (op == '+') {
                    snum = Integer.parseInt(text_num.getText().toString());
                    addition();
                } else if (op == '-') {
                    snum = Integer.parseInt(text_num.getText().toString());
                    substraction();
                } else if (op == '*') {
                    snum = Integer.parseInt(text_num.getText().toString());
                    multiplication();
                } else if (op == '/') {
                    snum = Integer.parseInt(text_num.getText().toString());
                    division();
                }
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fnum  = Integer.parseInt(text_num.getText().toString());
                text_num.setText("");
                op = '+';
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fnum  = Integer.parseInt(text_num.getText().toString());
                text_num.setText("");
                op = '-';
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fnum  = Integer.parseInt(text_num.getText().toString());
                text_num.setText("");
                op = '*';
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fnum  = Integer.parseInt(text_num.getText().toString());
                text_num.setText("");
                op = '/';
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num+"1");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num+"2");

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num+"3");

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num+"4");

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num+"5");

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num+"6");

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num+"7");

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num+"8");

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num+"9");

            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num+"0");

            }
        });
        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num+"00");

            }
        });
    }
    void addition(){
        int addition = fnum +  snum ;
        text_num.setText(""+addition);

    }
    void substraction(){
        int substraction = fnum -  snum ;
        text_num.setText(""+substraction);

    }
    void multiplication(){
        int multiplication = fnum *  snum ;
        text_num.setText(""+multiplication);

    }
    void division(){
        int division = fnum /  snum ;
        text_num.setText(""+division);

    }
}