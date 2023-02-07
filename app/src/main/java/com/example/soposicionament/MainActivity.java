package com.example.soposicionament;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recuparem dades
        Button btEntrada = (Button) findViewById(R.id.btEntrada);
        Button btMaps = (Button) findViewById(R.id.btMaps);
        Button btConf = (Button) findViewById(R.id.btConf);


        //ACCIÓ AL FER CLICK AL BOTO DE COMENÇAR
        btEntrada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });
    }
}