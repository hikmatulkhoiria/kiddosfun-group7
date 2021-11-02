package com.example.kiddosfun2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Singa extends AppCompatActivity {
    MediaPlayer player;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singa);}

    public void stage (View view){
        Intent intent = new Intent(Singa.this,MainActivity.class);
        startActivity(intent);
    }
    public void next (View view){
        Intent intent = new Intent(Singa.this,Kucing.class);
        startActivity(intent);
    }
    public void sound (View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.suara_singa);
        }
        player.start();
    }

}
