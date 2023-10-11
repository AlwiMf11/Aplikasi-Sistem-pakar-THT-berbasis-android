package com.halo.splashloginmotionlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tampilan extends AppCompatActivity {
Button penyakit,diagnosis,information;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan);


        penyakit =findViewById(R.id.penyakit);
        diagnosis =findViewById(R.id.diagnosis);
        information =findViewById(R.id.information);
        penyakit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beranda = new Intent(tampilan.this, Home.class);
                startActivity(beranda);
            }
        });
        diagnosis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beranda1 = new Intent(tampilan.this, Diagnosa.class);
                startActivity(beranda1);
            }
        });
        information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beranda3 = new Intent(tampilan.this, informasi.class);
                startActivity(beranda3);
            }
        });

    }
}