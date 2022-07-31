package com.example.multiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    int num1;
    int num2;
    EditText el1;
    EditText el2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        result = findViewById(R.id.res);
        el1 = findViewById(R.id.num11);
        el2 = findViewById(R.id.num22);
    }

    public void onPlus(View view) {
        int sum;
        num1 = Integer.parseInt(el1.getText().toString());
        num2 = Integer.parseInt(el2.getText().toString());
        sum = num1+num2;
        result.setText(String.valueOf(sum));
    }

    public void onMinus(View view) {
        int minus;
        num1 = Integer.parseInt(el1.getText().toString());
        num2 = Integer.parseInt(el2.getText().toString());
        minus = num1-num2;
        result.setText(String.valueOf(minus));
    }

    public void onBack(View view) {
        TextView onBack = (TextView)findViewById(R.id.onBack);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}