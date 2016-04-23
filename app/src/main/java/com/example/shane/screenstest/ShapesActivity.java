package com.example.shane.screenstest;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ShapesActivity extends AppCompatActivity {

    public ImageView square_image;
    MediaPlayer square;

    public void squareSound() {
        square_image = (ImageView) findViewById(R.id.square_image);
        square = MediaPlayer.create(this, R.raw.square);
        square_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                square.start();
            }


        });
    }

    public ImageView circle_image;
    MediaPlayer circle;

    public void circleSound() {
        circle_image = (ImageView) findViewById(R.id.circle_image);
        circle = MediaPlayer.create(this, R.raw.circle);
        circle_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circle.start();
            }


        });
    }

    public ImageView pentagon_image;
    MediaPlayer pentagon;

    public void pentagonSound() {
        pentagon_image = (ImageView) findViewById(R.id.pentagon_image);
        pentagon = MediaPlayer.create(this, R.raw.pentagon);
        pentagon_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pentagon.start();
            }


        });
    }

    public ImageView rectangle_image;
    MediaPlayer rectangle;

    public void rectangleSound() {
        rectangle_image = (ImageView) findViewById(R.id.rectangle_image);
        rectangle = MediaPlayer.create(this, R.raw.rectangle);
        rectangle_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rectangle.start();
            }


        });
    }




    public TextView irish_text_button;

    public void irishTextButton(){
        irish_text_button = (TextView)findViewById(R.id.irish_text_button);
        irish_text_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent irishShapes = new Intent(ShapesActivity.this, ShapesActivityIrish.class);
                startActivity(irishShapes);

            }


        });


    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);
        squareSound();
        circleSound();
        rectangleSound();
        pentagonSound();
        irishTextButton();
    }
}
