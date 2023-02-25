package com.example.soposicionament;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Configuracio extends AppCompatActivity {
    ImageButton imgEncendre;
    ImageButton imgApagar;
    public static int musica = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracio);

        imgApagar = findViewById(R.id.botomenysVolum);

        imgEncendre = findViewById(R.id.botoVolum);


        imgEncendre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musica = 1;
            }
        });
        imgApagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musica = 0;
            }
        });
    }
}