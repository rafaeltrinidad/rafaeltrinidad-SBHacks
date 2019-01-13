package com.example.rafael.sportstrackerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LengthsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lengths);

        Button button_next = (Button) findViewById(R.id.next_button);
        button_next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                /*EditText team1name = (EditText) findViewById(R.id.team1_fill);
                EditText team2name = (EditText) findViewById(R.id.team2_fill);
                TextView team1out = (TextView)(MainActivity) findViewById(R.id.Team_1);
                TextView team2out = (TextView)(MainActivity) findViewById(R.id.Team_2);
                MainActivity obj = new MainActivity();
                TextView team1out = obj.getTextView1();
                TextView team2out = obj.getTextView2();
                team1out.setText(team1name.getText().toString());
                team2out.setText(team2name.getText().toString());*/
                startActivity(new Intent(LengthsActivity.this, MainActivity.class));

            }
        });
    }

}
