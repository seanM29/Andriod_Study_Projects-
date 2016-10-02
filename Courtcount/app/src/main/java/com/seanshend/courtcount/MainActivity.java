package com.seanshend.courtcount;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int Ascore = 20;
    int Bscore = 0;

    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        displayForTeamA(Ascore);
        displayForTeamA(Bscore);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addAThreePoints() {
        Ascore += 3;
        displayForTeamA(Ascore);
    }

    public void addATwoPoints() {
        Ascore += 2;
        displayForTeamA(Ascore);
    }

    public void addAOnePoints() {
        Ascore++;
        displayForTeamA(Ascore);
    }

    public void addBThreePoints() {
        Bscore += 3;
        displayForTeamB(Bscore);
    }

    public void addBTwoPoints() {
        Bscore += 2;
        displayForTeamB(Bscore);
    }

    public void Bthrow() {
        Bscore = 0;
        displayForTeamB(Bscore);
    }

    public void reset() {
        Ascore = 0;
        Bscore = 0;

        displayForTeamA(Ascore);
        displayForTeamB(Bscore);
    }


}
