package com.example.wadek.basketballscorecounter;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreLakers = 0 ;
    int scoreCavs = 0 ;
    int score = 0 ;
    public TextView tvScoreLakers, tvScoreCavs ;
    public Button tvAddThreeForLakers, tvAddTwoForLakers,tvAddOneForLakers, tvAddThreeForCavs, tvAddTwoForCavs, tvAddOneForCavs, btnResetScore ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvScoreLakers = findViewById(R.id.tvScoreLakers);
        tvScoreCavs = findViewById(R.id.tvScoreCavs);

        tvAddOneForCavs = findViewById(R.id.tvAddOneForCavs);
        tvAddOneForCavs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              displayScoreForCavs(v);
            }
        });
        tvAddOneForLakers = findViewById(R.id.tvAddOneForLakers);
        tvAddOneForLakers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              displayScoreForLakers(v);
            }
        });
        tvAddTwoForCavs = findViewById(R.id.tvAddTwoForCavs);
        tvAddTwoForCavs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               displayScoreForCavs(v);
            }
        });
        tvAddTwoForLakers = findViewById(R.id.tvAddTwoForLakers);
        tvAddTwoForLakers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              displayScoreForLakers(v);
            }
        });
        tvAddThreeForCavs = findViewById(R.id.tvAddThreeForCavs);
        tvAddThreeForCavs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              displayScoreForCavs(v);
            }
        });
        tvAddThreeForLakers = findViewById(R.id.tvAddThreeForLakers);
        tvAddThreeForLakers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              displayScoreForLakers(v);
            }
        });
        btnResetScore = findViewById(R.id.btnResetScore);
        btnResetScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetScores(v);
            }
        });
    }
    @SuppressLint("SetTextI18n")
    public void displayScoreForLakers(View view){
        if (view.getId() == tvAddOneForLakers.getId()){
            scoreLakers = scoreLakers + 1 ;
        }
        if (view.getId() == tvAddTwoForLakers.getId()){
            scoreLakers = scoreLakers + 2;
        }
        if (view.getId() == tvAddThreeForLakers.getId()){
            scoreLakers = scoreLakers + 3;
        }
        tvScoreLakers.setText(" " + scoreLakers);
    }
    @SuppressLint("SetTextI18n")
    public void displayScoreForCavs(View view){
        if (view.getId() == tvAddOneForCavs.getId()){
            scoreCavs = scoreCavs + 1 ;
        }
        if (view.getId() == tvAddTwoForCavs.getId()){
            scoreCavs = scoreCavs + 2;
        }
        if (view.getId() == tvAddThreeForCavs.getId()){
            scoreCavs = scoreCavs + 3;
        }
        tvScoreCavs.setText(" " + scoreCavs);
    }
    @SuppressLint("SetTextI18n")
    public void resetScores(View view){
        scoreLakers = score ;
        scoreCavs = score ;
        tvScoreLakers.setText("" + score);
        tvScoreCavs.setText(" " + score);
    }

}
