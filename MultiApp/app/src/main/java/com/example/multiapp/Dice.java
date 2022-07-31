package com.example.multiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Dice extends AppCompatActivity {

    TextView dices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dice);
        dices = findViewById(R.id.page_dice);
    }

    public void onBack(View view) {
        TextView onBack = (TextView)findViewById(R.id.back3);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}