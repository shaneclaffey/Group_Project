package com.example.shane.screenstest;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ColoursActivityIrish extends AppCompatActivity {


    public ImageView red_square;
    MediaPlayer red;

    public void redSound() {
        red_square = (ImageView) findViewById(R.id.red_square);
        red = MediaPlayer.create(this, R.raw.redirish);
        red_square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                red.start();
            }


        });
    }

    public ImageView pink_square;
    MediaPlayer pink;

    public void pinkSound() {
        pink_square = (ImageView) findViewById(R.id.pink_square);
        pink = MediaPlayer.create(this, R.raw.pinkirish);
        pink_square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pink.start();
            }


        });
    }

    public ImageView green_square;
    MediaPlayer green;

    public void greenSound() {
        green_square = (ImageView) findViewById(R.id.green_square);
        green = MediaPlayer.create(this, R.raw.greenirish);
        green_square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                green.start();
            }


        });
    }

    public ImageView blue_square;
    MediaPlayer blue;

    public void blueSound() {
        blue_square = (ImageView) findViewById(R.id.blue_square);
        blue = MediaPlayer.create(this, R.raw.blueirish);
        blue_square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blue.start();
            }


        });
    }





    public TextView english_text_button;

    public void englishTextButton(){
        english_text_button = (TextView)findViewById(R.id.english_text_button);
        english_text_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent englishColours = new Intent(ColoursActivityIrish.this, ColoursActivity.class);
                startActivity(englishColours);

            }


        });


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colours_activity_irish);
        redSound();
        pinkSound();
        greenSound();
        blueSound();
        englishTextButton();
    }
}
