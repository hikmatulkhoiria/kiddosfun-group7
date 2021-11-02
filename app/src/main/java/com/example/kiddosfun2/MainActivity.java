package com.example.kiddosfun2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void singa (View view){
        Intent intent = new Intent(MainActivity.this,Singa.class);
        startActivity(intent);
    }
    public void kucing (View view) {
        Intent intent = new Intent(MainActivity.this, Kucing.class);
        startActivity(intent);
    }
    public void gajah (View view) {
        Intent intent = new Intent(MainActivity.this, Gajah.class);
        startActivity(intent);
    }
    public void domba (View view) {
        Intent intent = new Intent(MainActivity.this, Domba.class);
        startActivity(intent);
    }
    public void ayam (View view) {
        Intent intent = new Intent(MainActivity.this, Ayam.class);
        startActivity(intent);
    }
}