package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer first, second, resul;
    private TextView textView;
    private Boolean isOperationClick;
    Operation operation;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);


    }

    public void OnNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_0:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("0");
                } else {
                    textView.append("0");
                }
                break;

            case R.id.btn_1:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("1");
                } else {
                    textView.append("1");
                }
                break;
            case R.id.btn_2:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("2");
                } else {
                    textView.append("2");
                }
                break;
            case R.id.btn_3:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("3");
                } else {
                    textView.append("3");
                }
                break;
            case R.id.btn_4:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("4");
                } else {
                    textView.append("4");
                }
                break;
            case R.id.btn_5:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("5");
                } else {
                    textView.append("5");
                }
                break;
            case R.id.btn_6:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("6");
                } else {
                    textView.append("6");
                }
                break;
            case R.id.btn_7:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("7");
                } else {
                    textView.append("7");
                }
                break;
            case R.id.btn_8:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("8");
                } else {
                    textView.append("8");
                }
                break;
            case R.id.btn_9:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("9");
                } else {
                    textView.append("9");
                }
                break;
            case R.id.btn_clear:
                textView.setText("0");
                first = 0;
                second = 0;
                break;
        }
    }

    public void OnOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                first = Integer.valueOf(textView.getText().toString());
                operation = Operation.PLUS;
                break;

            case R.id.btn_minus:
                first = Integer.valueOf(textView.getText().toString());
                operation = Operation.MINUS;
                break;

            case R.id.btn_devision:
                first = Integer.valueOf(textView.getText().toString());
                operation = Operation.DIVISION;
                break;
            case R.id.btn_multiplication:
                first = Integer.valueOf(textView.getText().toString());
                operation = Operation.MULTIPLICATION;
                break;
            case R.id.btn_rovno:
                if (operation == Operation.PLUS) {
                    second = Integer.valueOf(textView.getText().toString());
                    resul = first + second;
                    textView.setText(resul.toString());
                } else if (operation == Operation.MINUS) {
                    second = Integer.valueOf(textView.getText().toString());
                    resul = first - second;
                    textView.setText(resul.toString());
                } else if (operation == Operation.DIVISION) {
                    second = Integer.valueOf(textView.getText().toString());
                    resul = first / second;
                    textView.setText(resul.toString());
                } else if (operation == Operation.MULTIPLICATION) {
                    second = Integer.valueOf(textView.getText().toString());
                    resul = first * second;
                    textView.setText(resul.toString());

                }
                isOperationClick = true;
        }
    }
}