package com.example.android.horseshoescorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int redTeamScore = 0;
    int blueTeamScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayWinnerRed(String winnerRed) {
        TextView winnerRedTextView = (TextView) findViewById(R.id.redTeamWin);
        winnerRedTextView.setText(String.valueOf(winnerRed));
    }

    public void displayWinnerBlue(String winnerBlue) {
        TextView winnerBlueTextView = (TextView) findViewById(R.id.blueTeamWin);
        winnerBlueTextView.setText(String.valueOf(winnerBlue));
    }

    /**
     * Displays the given score for the Red Team.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_team_score);
        scoreView.setText(String.valueOf(score));

        if (redTeamScore >= 15) {
            displayWinnerRed("WINNER");
        }
    }

    /**
     * Add 3 points to the Red team's score.
     */
    public void ringerForRedTeam(View view ) {
        redTeamScore = redTeamScore + 3;
        displayForTeamA(redTeamScore);
    }

    /**
     * Add 2 points to the Red team's score.
     */
    public void leanerForRedTeam(View view ) {
        redTeamScore = redTeamScore + 2;
        displayForTeamA(redTeamScore);
    }

    /**
     * Add 1 point to Team A's score.
     */
    public void closestToPinRedTeam(View view ) {
        redTeamScore = redTeamScore + 1;
        displayForTeamA(redTeamScore);
    }


    /**
     * Displays the given score for the Blue Team.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.blue_team_score);
        scoreView.setText(String.valueOf(score));

        if (blueTeamScore >= 15) {
            displayWinnerBlue("WINNER");
        }
    }

    /**
     * Add 3 points to the Blue team's score.
     */
    public void ringerForBlueTeam(View view ) {
        blueTeamScore = blueTeamScore + 3;
        displayForTeamB(blueTeamScore);
    }

    /**
     * Add 2 points to Blue team's score.
     */
    public void leanerForBlueTeam(View view ) {
        blueTeamScore = blueTeamScore + 2;
        displayForTeamB(blueTeamScore);
    }

    /**
     * Add 1 point to Blue team's score.
     */
    public void closestToPinBlueTeam(View view ) {
        blueTeamScore = blueTeamScore + 1;
        displayForTeamB(blueTeamScore);
    }

    /**
     * Reset the scores back to zero
     */
    public void resetScores(View view) {
        redTeamScore = 0;
        blueTeamScore = 0;
        displayForTeamA(redTeamScore);
        displayForTeamB(blueTeamScore);
        displayWinnerRed("");
        displayWinnerBlue("");
        }
}
