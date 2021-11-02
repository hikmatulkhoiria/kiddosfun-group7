package com.example.kiddosfun2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Domba extends AppCompatActivity {
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domba);
    }
    public void back (View view){
        Intent intent = new Intent(Domba.this,Gajah.class);
        startActivity(intent);
    }
    public void stage (View view){
        Intent intent = new Intent(Domba.this,MainActivity.class);
        startActivity(intent);
    }
    public void next (View view){
        Intent intent = new Intent(Domba.this,Ayam.class);
        startActivity(intent);
    }
    public void sound (View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.suara_domba);
        }
        player.start();
    }
}