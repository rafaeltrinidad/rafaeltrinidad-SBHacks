package com.example.rafael.sportstrackerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int leftCount = 0;
    private int rightCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.left2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                leftCount += 2;
                TextView leftScore = (TextView) findViewById(R.id.leftScore);
                leftScore.setText("" + leftCount);
            }
        });
    }
}
