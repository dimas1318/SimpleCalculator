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
    private Button butPlus;
    private Button butMinus;
    private Button butEquals;

    private int valueOne;
    private Operation operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.number_input);
        but1 = findViewById(R.id.but_1);
        but2 = findViewById(R.id.but_2);
        but3 = findViewById(R.id.but_3);
        butPlus = findViewById(R.id.but_plus);
        butMinus = findViewById(R.id.but_minus);
        butEquals = findViewById(R.id.but_equals);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = input.getText().toString();
                text += "1";
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
                    default:
                        result = "Что-то не так";
                        break;
                }
                input.setText(result);
            }
        });
    }


}