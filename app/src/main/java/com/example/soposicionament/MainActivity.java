package com.example.soposicionament;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GestureDetector mGestureDetector;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGestureDetector = new GestureDetector(this, new GestureListener());
        MediaPlayer soBotons = MediaPlayer.create(this, R.raw.sobotons);

        //recuparem dades
        Button btEntrada = (Button) findViewById(R.id.btEntrada);
        Button btMaps = (Button) findViewById(R.id.btMaps);
        Button btConf = (Button) findViewById(R.id.btConf);

        btConf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soBotons.start();
                Intent intent = new Intent( MainActivity.this, Configuracio.class);
                startActivity(intent);
            }
        });


        //ACCIÓ AL FER CLICK AL BOTO DE COMENÇAR
        btEntrada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soBotons.start();
                Intent intent = new Intent( MainActivity.this, LlistaConcerts.class);
                startActivity(intent);
            }
        });

        btMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soBotons.start();
                Intent intent = new Intent( MainActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });
    }
    private class GestureListener extends GestureDetector.SimpleOnGestureListener{
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            Intent intent = new Intent( MainActivity.this, MapsActivity.class);
            startActivity(intent);
            return super.onFling(e1, e2, velocityX, velocityY);
        }
        @Override
        public boolean onDoubleTap(MotionEvent e) {
            Intent intent = new Intent( MainActivity.this, LlistaConcerts.class);
            startActivity(intent);
            return super.onDoubleTap(e);
        }

        @Override
        public boolean onSingleTapConfirmed(MotionEvent e) {
            Intent intent = new Intent( MainActivity.this, Configuracio.class);
            startActivity(intent);
            return super.onSingleTapConfirmed(e);
        }

        @Override
        public void onLongPress(@NonNull MotionEvent e) {
            onDestroy();
            super.onLongPress(e);
        }
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mGestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
    protected void onDestroy() {

        Log.i(TAG,"Me destrulleron");
        super.onDestroy();
        android.os.Process.killProcess(android.os.Process.myPid());
    }


}

