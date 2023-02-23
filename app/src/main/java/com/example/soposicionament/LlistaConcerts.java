package com.example.soposicionament;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LlistaConcerts extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llista_concerts);

        RecyclerView rvllistaConcerts = findViewById(R.id.llistaConcerts);
        rvllistaConcerts.setHasFixedSize(true);
        rvllistaConcerts.setLayoutManager(new LinearLayoutManager(this));

        Concert[] concerts = new Concert[]{
                new Concert("21/02/2023", "Valls"),
                new Concert("20/05/2023", "Barcelona"),
                new Concert("20/05/2023", "Girona"),
                new Concert("20/05/2023", "Tarragona"),
                new Concert("20/05/2023", "Reus"),
        };

      Adapter_concerts adapter = new Adapter_concerts(concerts,this);
        rvllistaConcerts.setAdapter(adapter);
    }

}