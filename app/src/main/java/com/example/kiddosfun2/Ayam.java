package com.example.kiddosfun2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Ayam extends AppCompatActivity {
    MediaPlayer player;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayam);
    }
    public void back (View view){
        Intent intent = new Intent(Ayam.this,Domba.class);
        startActivity(intent);
    }
    public void stage (View view){
        Intent intent = new Intent(Ayam.this,MainActivity.class);
        startActivity(intent);
    }
    public void sound (View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.suara_ayam);
        }
        player.start();
    }
}