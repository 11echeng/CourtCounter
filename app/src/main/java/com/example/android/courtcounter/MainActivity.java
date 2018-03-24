package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(8);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plusThree(View view) {
        int splash = 3;
        score = score + splash;
        displayForTeamA(score);

    }


    public void plusThree_b(View view) {
        int splash = 3;
        score = score + splash;
        displayForTeamB(score);

    }

    public void reset(View view) {
        score = 0;
        displayForTeamB(score);
        displayForTeamA(score);
    }

    public void plusTwo(View view) {
        int midrange = 2;
        score = score + midrange;
        displayForTeamA(score);
    }

    public void plusTwo_b(View view) {
        int midrange = 2;
        score = score + midrange;
        displayForTeamB(score);
    }


    public void plusOne(View view) {
        int freebie = 1;
        score = score + freebie;
        displayForTeamA(score);
    }

    public void plusOne_b(View view) {
        int freebie = 1;
        score = score + freebie;
        displayForTeamB(score);
    }
}
