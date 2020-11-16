package com.anddev.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView input;
    private Button but1;
    private Button but2;
    private Button but3;
    private Button but4;
    private Button but5;
    private Button but6;
    private Button but7;
    private Button but8;
    private Button but9;
    private Button butPlus;
    private Button butMinus;
    private Button butMult;
    private Button butDiv;
    private Button butEquals;
    private Button butClear;

    private int valueOne;
    private Operation operation = Operation.EMPTY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.number_input);
        but1 = findViewById(R.id.but_1);
        but2 = findViewById(R.id.but_2);
        but3 = findViewById(R.id.but_3);
        but4 = findViewById(R.id.but_4);
        but5 = findViewById(R.id.but_5);
        but6 = findViewById(R.id.but_6);
        but7 = findViewById(R.id.but_7);
        but8 = findViewById(R.id.but_8);
        but9 = findViewById(R.id.but_9);

        butPlus = findViewById(R.id.but_plus);
        butMinus = findViewById(R.id.but_minus);
        butMult = findViewById(R.id.but_mult);
        butDiv = findViewById(R.id.but_div);
        butEquals = findViewById(R.id.but_equals);


        butClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                valueOne = 0;
                operation = Operation.EMPTY;
            }
        });

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = input.getText().toString();
                text += "1";
                input.setText(text);
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = input.getText().toString();
                text += "2";
                input.setText(text);
            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = input.getText().toString();
                text += "3";
                input.setText(text);
            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = input.getText().toString();
                text += "4";
                input.setText(text);
            }
        });

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = input.getText().toString();
                text += "5";
                input.setText(text);
            }
        });

        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = input.getText().toString();
                text += "6";
                input.setText(text);
            }
        });

        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = input.getText().toString();
                text += "7";
                input.setText(text);
            }
        });

        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = input.getText().toString();
                text += "8";
                input.setText(text);
            }
        });

        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = input.getText().toString();
                text += "9";
                input.setText(text);
            }
        });

        butPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = input.getText().toString();
                valueOne = Integer.parseInt(text);
                input.setText("");
                operation = Operation.ADD;
            }
        });

        butMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = input.getText().toString();
                valueOne = Integer.parseInt(text);
                input.setText("");
                operation = Operation.ADD;
            }
        });

        butMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = input.getText().toString();
                valueOne = Integer.parseInt(text);
                input.setText("");
                operation = Operation.MULT;
            }
        });

        butDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = input.getText().toString();
                valueOne = Integer.parseInt(text);
                input.setText("");
                operation = Operation.DIV;
            }
        });

        butEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = input.getText().toString();
                int valueTwo = Integer.parseInt(text);
                String result;
                switch (operation) {
                    case ADD:
                        result = String.valueOf(valueOne + valueTwo);
                        break;
                    case SUB:
                        result = String.valueOf(valueOne - valueTwo);
                        break;
                    case DIV:
                        result = String.valueOf(valueOne / valueTwo);
                        break;
                    case MULT:
                        result = String.valueOf(valueOne * valueTwo);
                        break;
                    default:
                        result = "Что-то не так";
                        break;
                }
                input.setText(result);
            }
        });
    }


}