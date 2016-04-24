package com.example.shane.screenstest;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalsActivityIrish extends AppCompatActivity {



    public ImageView cow_button;
    MediaPlayer cow;

    public void cowSound() {
        cow_button = (ImageView) findViewById(R.id.cow_button);
        cow = MediaPlayer.create(this, R.raw.cow);
        cow_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cow.start();
            }


        });
    }

    public ImageView dog_button;
    MediaPlayer dog;

    public void dogSound() {
        dog_button = (ImageView) findViewById(R.id.dog_button);
        dog = MediaPlayer.create(this, R.raw.dog);
        dog_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dog.start();
            }


        });
    }

    public ImageView duck_button;
    MediaPlayer duck;

    public void duckSound() {
        duck_button = (ImageView) findViewById(R.id.duck_button);
        duck = MediaPlayer.create(this, R.raw.duck);
        duck_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                duck.start();
            }


        });
    }

    public ImageView sheep_button;
    MediaPlayer sheep;

    public void sheepSound() {
        sheep_button = (ImageView) findViewById(R.id.sheep_button);
        sheep = MediaPlayer.create(this, R.raw.sheep);
        sheep_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sheep.start();
            }


        });
    }

    public TextView english_text_button;

    public void englishTextButton(){
        english_text_button = (TextView)findViewById(R.id.english_text_button);
        english_text_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent englishAnimals = new Intent(AnimalsActivityIrish.this, AnimalsActivity.class);
                startActivity(englishAnimals);

            }


        });


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_activity_irish);
        cowSound();
        dogSound();
        duckSound();
        sheepSound();
        englishTextButton();
    }
}
