package com.example.smpn01ngargoyoso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FasilitasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fasilitas);
    }public void masjidclick(View view) {
        Intent intent = new Intent(FasilitasActivity.this, MasjidActivity.class);
        startActivity(intent);
    }public void lapclick(View view) {
        Intent intent = new Intent(FasilitasActivity.this, LapanganActivity.class);
        startActivity(intent);
    }public void kanclick(View view) {
        Intent intent = new Intent(FasilitasActivity.this, KantinActivity.class);
        startActivity(intent);
    }public void labclick(View view) {
        Intent intent = new Intent(FasilitasActivity.this, LaboratoriumActivity.class);
        startActivity(intent);
    }public void perclick(View view) {
        Intent intent = new Intent(FasilitasActivity.this, PerpusActivity.class);
        startActivity(intent);
    }
}