package com.example.suketurastogi.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int totalRunsTeamA = 0;
    int totalRunsTeamB = 0;
    int playersLeftTeamA = 10;
    int playersLeftTeamB = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Adds One Run for Team A.
     */
    public void addOneRunTeamA(View view) {
        totalRunsTeamA = totalRunsTeamA + 1;
        displayRunsForTeamA(totalRunsTeamA);
    }

    /**
     * Adds One Run for Team B.
     */
    public void addOneRunTeamB(View view) {
        totalRunsTeamB = totalRunsTeamB + 1;
        displayRunsForTeamB(totalRunsTeamB);
    }

    /**
     * Adds Four Runs for Team A.
     */
    public void addFourRunsTeamA(View view) {
        totalRunsTeamA = totalRunsTeamA + 4;
        displayRunsForTeamA(totalRunsTeamA);
    }

    /**
     * Adds Four Runs for Team B.
     */
    public void addFourRunsTeamB(View view) {
        totalRunsTeamB = totalRunsTeamB + 4;
        displayRunsForTeamB(totalRunsTeamB);
    }

    /**
     * Adds Six Runs for Team A.
     */
    public void addSixRunsTeamA(View view) {
        totalRunsTeamA = totalRunsTeamA + 6;
        displayRunsForTeamA(totalRunsTeamA);
    }

    /**
     * Adds Six Runs for Team B.
     */
    public void addSixRunsTeamB(View view) {
        totalRunsTeamB = totalRunsTeamB + 6;
        displayRunsForTeamB(totalRunsTeamB);
    }

    /**
     * One Player Out Of Team A.
     */
    public void playerOutTeamA(View view) {
        /**
         * If Condition Is Used As Total Number Of Players Cannot Be Less Then 0.
         */
        if (playersLeftTeamA == 0) {
            return;
        }
        playersLeftTeamA = playersLeftTeamA - 1;
        displayPlayersForTeamA(playersLeftTeamA);
    }

    /**
     * One Player Out Of Team B.
     */
    public void playerOutTeamB(View view) {
        /**
         * If Condition Is Used As Total Number Of Players Cannot Be Less Then 0.
         */
        if (playersLeftTeamB == 0) {
            return;
        }
        playersLeftTeamB = playersLeftTeamB - 1;
        displayPlayersForTeamB(playersLeftTeamB);
    }

    /**
     * Resets All Values To Initial Stage.
     */
    public void allReset(View view) {
        totalRunsTeamA = 0;
        totalRunsTeamB = 0;
        playersLeftTeamA = 10;
        playersLeftTeamB = 10;
        displayRunsForTeamA(totalRunsTeamA);
        displayRunsForTeamB(totalRunsTeamB);
        displayPlayersForTeamA(playersLeftTeamA);
        displayPlayersForTeamB(playersLeftTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayRunsForTeamA(int score) {
        TextView runsView = (TextView) findViewById(R.id.team_a_score);
        runsView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayRunsForTeamB(int score) {
        TextView runsView = (TextView) findViewById(R.id.team_b_score);
        runsView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Players for Team A.
     */
    public void displayPlayersForTeamA(int player) {
        TextView playersView = (TextView) findViewById(R.id.team_a_players);
        playersView.setText(String.valueOf(player));
    }

    /**
     * Displays the given Players for Team B.
     */
    public void displayPlayersForTeamB(int player) {
        TextView playersView = (TextView) findViewById(R.id.team_b_players);
        playersView.setText(String.valueOf(player));
    }
}