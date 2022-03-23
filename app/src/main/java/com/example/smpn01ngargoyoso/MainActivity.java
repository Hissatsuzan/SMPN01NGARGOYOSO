package com.example.smpn01ngargoyoso;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void guruclick(View view) {
        Intent intent = new Intent(MainActivity.this, GuruActivity.class);
        startActivity(intent);
    }public void kelasclick(View view) {
        Intent intent = new Intent(MainActivity.this, KelasActivity.class);
        startActivity(intent);
    }public void profilclick(View view) {
        Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(intent);
    }public void fasilitasclick(View view) {
        Intent intent = new Intent(MainActivity.this, FasilitasActivity.class);
        startActivity(intent);
    }public void ekskulclick(View view) {
        Intent intent = new Intent(MainActivity.this, EkskulActivity.class);
        startActivity(intent);
    }public void pelajaranclick(View view) {
        Intent intent = new Intent(MainActivity.this, PelajaranActivity.class);
        startActivity(intent);
    }
}