package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    public int pointsA=0;
    public  int pointsB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamB(pointsB);
        displayForTeamA(pointsA);

    }
    public void three_point(View view) {
        pointsA= pointsA+3;

        displayForTeamA(pointsA);
    }
    public void two_points(View view){
        pointsA=pointsA+2;
        displayForTeamA(pointsA);
    }
    public void free_throw(View view){
        pointsA=pointsA+1;
        displayForTeamA(pointsA);
    }
    public void three_b_points(View view) {
        pointsB= pointsB+3;

        displayForTeamB(pointsB);
    }
    public void two_b_points(View view){
        pointsB=pointsB+2;
        displayForTeamB(pointsB);
    }
    public void free_b_throw(View view){
        pointsB=pointsB+1;
        displayForTeamB(pointsB);
    }
    public void reset_Score(View view){
        pointsA=0;
        pointsB=0;
        displayForTeamB(pointsB);
        displayForTeamA(pointsA);
    }





    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }



}