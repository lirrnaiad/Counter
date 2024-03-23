package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    TextView welcomeText, counterText;
    Button startCount;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiate
        welcomeText = findViewById(R.id.welcome_text);
        counterText = findViewById(R.id.counter_text);
        startCount = findViewById(R.id.button_start);

        startCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterText.setText("" + increaseCounter());
            }
        });
    }

    public int increaseCounter() {
           return ++counter;
    }
}