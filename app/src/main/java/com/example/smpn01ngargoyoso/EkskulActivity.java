package com.example.smpn01ngargoyoso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EkskulActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekskul);
    }public void osisclick(View view) {
        Intent intent = new Intent(EkskulActivity.this, OsisActivity.class);
        startActivity(intent);
    }public void imclick(View view) {
        Intent intent = new Intent(EkskulActivity.this, ImActivity.class);
        startActivity(intent);
    }public void pmrclick(View view) {
        Intent intent = new Intent(EkskulActivity.this, PmrActivity.class);
        startActivity(intent);
    }public void basketclick(View view) {
        Intent intent = new Intent(EkskulActivity.this, BasketActivity.class);
        startActivity(intent);
    }public void silatclick(View view) {
        Intent intent = new Intent(EkskulActivity.this, SilatActivity.class);
        startActivity(intent);

    }
}