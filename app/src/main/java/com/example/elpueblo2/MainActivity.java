package com.example.elpueblo2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    //Aquí vamos a poner LOS ATRIBUTOS = VARIABLES
    MediaPlayer cancion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cancion=MediaPlayer.create(this,R.raw.audio1);
        cancion.start();


        //Temporizar el lanzamiento de la canción
        TimerTask inicioAPP= new TimerTask() {
            @Override
            //esto es un metodo
            public void run() {

                Intent intent=new Intent(MainActivity.this,Home.class);
                startActivity(intent);
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(inicioAPP,15000);
    }
}