package com.example.multiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
    }

    public void onPlusButton(View view) {
        EditText el1 = (EditText)findViewById(R.id.Number);
        EditText el3 = (EditText)findViewById(R.id.Number2);
        TextView TextRes = (TextView)findViewById(R.id.Res);
        int num1 = Integer.parseInt(el1.getText().toString());
        int num3 = Integer.parseInt(el3.getText().toString());
        int ResSum = num1 + num3;
        TextRes.setText(Integer.toString(ResSum));

    }

    public void onMinusButton(View view) {
        EditText el1 = (EditText)findViewById(R.id.Number);
        EditText el3 = (EditText)findViewById(R.id.Number2);
        TextView TextRes = (TextView)findViewById(R.id.Res);
        int num1 = Integer.parseInt(el1.getText().toString());
        int num3 = Integer.parseInt(el3.getText().toString());
        int ResMinus = num1 - num3;
        TextRes.setText(Integer.toString(ResMinus));

    }
}