package com.example.shane.screenstest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public ImageButton shapes_image_button;

    public void shapePageButton(){
        shapes_image_button = (ImageButton)findViewById(R.id.shapes_image_button);
        shapes_image_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pageShapes = new Intent(MainActivity.this, ShapesActivity.class);
                startActivity(pageShapes);

            }


        });


    }

    public TextView shapes_text_button;

    public void shapeTextButton(){
        shapes_text_button = (TextView)findViewById(R.id.shapes_text_button);
        shapes_text_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pageShapes = new Intent(MainActivity.this, ShapesActivity.class);
                startActivity(pageShapes);

            }


        });


    }

    public ImageView colour_image_button;

    public void coloursPageButton(){
        colour_image_button = (ImageView)findViewById(R.id.colour_image_button);
        colour_image_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent colours = new Intent(MainActivity.this, ColoursActivity.class);
                startActivity(colours);

            }


        });


    }


    public TextView colours_text_button;

    public void coloursTextButton(){
        colours_text_button = (TextView)findViewById(R.id.colours_text_button);
        colours_text_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent colours = new Intent(MainActivity.this, ColoursActivity.class);
                startActivity(colours);

            }


        });


    }

    public ImageView animal_image_button;

    public void animalPageButton(){
        animal_image_button = (ImageView)findViewById(R.id.animal_image_button);
        animal_image_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent animal = new Intent(MainActivity.this, AnimalsActivity.class);
                startActivity(animal);

            }


        });


    }

    public TextView animal_text_button;

    public void animalTextButton(){
        animal_text_button = (TextView)findViewById(R.id.animal_text_button);
        animal_text_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent animal = new Intent(MainActivity.this, AnimalsActivity.class);
                startActivity(animal);

            }


        });


    }

    public TextView video_text_button;

    public void videoTextButton(){
        video_text_button = (TextView)findViewById(R.id.video_text_button);
        video_text_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent video = new Intent(MainActivity.this, SoundsActivity.class);
                startActivity(video);

            }


        });


    }

    public ImageView video_image_button;

    public void videoPageButton(){
        video_image_button = (ImageView)findViewById(R.id.video_image_button);
        video_image_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent video = new Intent(MainActivity.this, SoundsActivity.class);
                startActivity(video);

            }


        });


    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        shapePageButton();
        shapeTextButton();
        coloursPageButton();
        coloursTextButton();
        animalTextButton();
        animalPageButton();
        videoTextButton();
        videoPageButton();
    }
}
