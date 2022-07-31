package com.example.multiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Clicker extends AppCompatActivity {
    int count;
    TextView result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clicker);
        count = 0;
        result = findViewById(R.id.result);

    }

    public void onBack(View view) {
        TextView onBack = (TextView)findViewById(R.id.onBack);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void Clicker(View View) {
        count++;
        result.setText(String.valueOf(count));

    }
}