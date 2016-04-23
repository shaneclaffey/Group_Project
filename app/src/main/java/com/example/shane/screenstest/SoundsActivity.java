package com.example.shane.screenstest;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SoundsActivity extends AppCompatActivity {

    public Button colours_button;
    MediaPlayer colours;

    @Override
    protected void onPause() {
        super.onPause();
    }

    public void coloursSound() {
        colours_button = (Button) findViewById(R.id.colours_button);
        colours = MediaPlayer.create(this, R.raw.colours);
        colours_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    colours.start();

            }

        });
    }

    public void coloursStop() {
        colours_button = (Button) findViewById(R.id.colour_stop);
        colours_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colours.release();
            }

        });
    }

    public Button numbers_button;
    MediaPlayer numbers;

    public void numbersSound() {
        numbers_button = (Button) findViewById(R.id.numbers_button);
        numbers = MediaPlayer.create(this, R.raw.numbers);
        numbers_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.start();
            }

        });
    }

    public void numbersStop() {
        numbers_button = (Button) findViewById(R.id.numbers_stop);
        numbers_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.release();
            }

        });
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sounds);
        coloursSound();
        coloursStop();


    }
}
