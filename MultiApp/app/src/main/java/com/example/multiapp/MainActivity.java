package com.example.multiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCalc(View view) {
        TextView Calculator = (TextView)findViewById(R.id.Calc);
        Intent new_intent = new Intent(MainActivity.this, Calculator.class);
        startActivity(new_intent); }

    public void onClick(View view) {
        TextView Click = (TextView)findViewById(R.id.Click);
        Intent intent = new Intent(MainActivity.this, Clicker.class);
        startActivity(intent);
    }

    public void onDice(View view) {
        TextView Dice = (TextView)findViewById(R.id.Dice);
        Intent dice_intent = new Intent(MainActivity.this, Dice.class);
        startActivity(dice_intent);
    }




}