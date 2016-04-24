package com.example.shane.screenstest;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ColoursActivity extends AppCompatActivity {


    public ImageView red_square;
    MediaPlayer red;

    public void redSound() {
        red_square = (ImageView) findViewById(R.id.red_square);
        red = MediaPlayer.create(this, R.raw.red);
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
        pink = MediaPlayer.create(this, R.raw.pink);
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
        green = MediaPlayer.create(this, R.raw.green);
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
        blue = MediaPlayer.create(this, R.raw.blue);
        blue_square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blue.start();
            }


        });
    }


    public TextView irish_text_button;

    public void irishTextButton(){
        irish_text_button = (TextView)findViewById(R.id.irish_text_button);
        irish_text_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent irishShapes = new Intent(ColoursActivity.this, ColoursActivityIrish.class);
                startActivity(irishShapes);

            }


        });


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colours);
        redSound();
        pinkSound();
        greenSound();
        blueSound();
        irishTextButton();
    }


}
