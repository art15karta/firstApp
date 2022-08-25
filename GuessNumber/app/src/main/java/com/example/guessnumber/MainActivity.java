package com.example.guessnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnDivide;
    Button btnMulty;
    Button btnRefresh;
    ImageButton btnMinus;
    ImageButton btnPlus;
    TextView textCount;
    Button btnGuess;
    Button btnCheat;
    int count = 1000;
    int num = BinarySearch.onRefresh();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDivide = findViewById(R.id.btnDivide);
        btnMulty = findViewById(R.id.btnMulty);
        btnMinus = findViewById(R.id.btnMinus);
        btnPlus = findViewById(R.id.btnPlus);
        btnGuess = findViewById(R.id.btnGuess);
        textCount = findViewById(R.id.textCount);
        textCount.setText(String.valueOf(count));
        btnCheat = findViewById(R.id.btnCheat);
        btnRefresh = findViewById(R.id.btnRefresh);

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                textCount.setText(String.valueOf(count));
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                textCount.setText(String.valueOf(count));
            }
        });


        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count = BinarySearch.onDivide(count);
                textCount.setText(String.valueOf(count));

            }
        });

        btnMulty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = BinarySearch.onMulty(count);
                textCount.setText(String.valueOf(count));
            }
        });

        btnGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int messageId = 0;

                if (count == (int)num) {
                    messageId = R.string.quess;
                } else if (count < (int)num) {
                    messageId = R.string.too_low;
                } else if (count > (int)num) {
                    messageId = R.string.too_much;
                }

                Toast.makeText(MainActivity.this, messageId, Toast.LENGTH_SHORT).show();
            }
        });

        btnCheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cheating = String.valueOf(num);
                Toast.makeText(MainActivity.this, cheating, Toast.LENGTH_SHORT).show();
            }
        });

        btnRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = BinarySearch.onRefresh();
                count = 1000;
                textCount.setText(String.valueOf(count));
            }
        });
    }
}