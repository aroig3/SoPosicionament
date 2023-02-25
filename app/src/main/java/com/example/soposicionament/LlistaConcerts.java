package com.example.soposicionament;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class LlistaConcerts extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llista_concerts);
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.musica);
        if (Configuracio.musica==1){
            mediaPlayer.start();
        } else if (Configuracio.musica==0){
            mediaPlayer.stop();
        }

        RecyclerView rvllistaConcerts = findViewById(R.id.llistaConcerts);
        rvllistaConcerts.setHasFixedSize(true);
        rvllistaConcerts.setLayoutManager(new LinearLayoutManager(this));

        Concert[] concerts = new Concert[]{
                new Concert("21/02/2023", "Valls", R.drawable.concert1),
                new Concert("20/05/2023", "Barcelona", R.drawable.concert2),
                new Concert("06/06/2023", "Girona", R.drawable.concert03),
                new Concert("13/06/2023", "Tarragona", R.drawable.concert04),
                new Concert("14/06/2023", "Reus", R.drawable.concert05)
        };

        Adapter_concerts adapter = new Adapter_concerts(concerts,this);
        rvllistaConcerts.setAdapter(adapter);
    }
}