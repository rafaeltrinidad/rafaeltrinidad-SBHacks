package com.example.rafael.sportstrackerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int leftCount = 0;
    private int rightCount = 0;

    /*EditText team1name;
    EditText team2name;
    TextView team1out;
    TextView team2out;*/

    public TextView getTextView1()
    {
        TextView txtView = (TextView)findViewById(R.id.Team_1);
        return txtView;
    }
    public TextView getTextView2()
    {
        TextView txtView = (TextView)findViewById(R.id.Team_2);
        return txtView;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*team1name = (EditText) findViewById(R.id.team1_fill);
        team2name = (EditText) findViewById(R.id.team2_fill);
        team1out = (TextView) findViewById(R.id.Team_1);
        team2out = (TextView) findViewById(R.id.Team_2);
        team1out.setText(team1name.getText());
        team2out.setText(team2name.getText());*/

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

        Button button_quit = (Button) findViewById(R.id.quit);
        button_quit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LengthsActivity.class));
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
