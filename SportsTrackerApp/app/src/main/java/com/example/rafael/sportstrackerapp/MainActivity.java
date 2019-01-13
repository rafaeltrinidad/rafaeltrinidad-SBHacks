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

        Button button_L1 = (Button) findViewById(R.id.left1);
        button_L1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                alterScore(true, 1);
            }
        });
        Button button_L2 = (Button) findViewById(R.id.left2);
        button_L2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                alterScore(true, 2);
            }
        });
        Button button_L3 = (Button) findViewById(R.id.left3);
        button_L3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                alterScore(true, 3);
            }
        });
        Button button_R1 = (Button) findViewById(R.id.right1);
        button_R1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                alterScore(false, 1);
            }
        });
        Button button_R2 = (Button) findViewById(R.id.right2);
        button_R2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                alterScore(false, 2);
            }
        });
        Button button_R3 = (Button) findViewById(R.id.right3);
        button_R3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                alterScore(false, 3);
            }
        });
    }

    private void alterScore(boolean isLeftScore, int amt) {
        if(isLeftScore) {
           leftCount += amt;
           TextView leftScore = (TextView) findViewById(R.id.leftScore);
           leftScore.setText("" + leftCount);
        }else {
            rightCount += amt;
            TextView rightScore = (TextView) findViewById(R.id.rightScore);
            rightScore.setText("" + rightCount);
        }
    }
}
