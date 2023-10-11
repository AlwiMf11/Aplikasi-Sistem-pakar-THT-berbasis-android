package com.halo.splashloginmotionlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class Home extends AppCompatActivity {
    LinearLayout beranda, profil, prodi, akademik, pendaftaran, beasiswa;

    TextView obah;
    ViewFlipper viewFlipper;
    Animation fadein, fadeout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        obah = (TextView) findViewById(R.id.marqueeText);
        obah.setSelected(true);
        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);
        fadein = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        fadeout = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        viewFlipper.setInAnimation(fadein);
        viewFlipper.setOutAnimation(fadeout);
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();
        beranda = (LinearLayout) findViewById(R.id.beranda);
        profil = (LinearLayout) findViewById(R.id.profil);
        prodi = (LinearLayout) findViewById(R.id.prodi);
        akademik = (LinearLayout) findViewById(R.id.akademik);
        pendaftaran = (LinearLayout) findViewById(R.id.pendaftaran);
        beasiswa = (LinearLayout) findViewById(R.id.beasiswa);


        beranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beranda = new Intent(Home.this, Telinga.class);
                startActivity(beranda);
            }
        });

        prodi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prodi = new Intent(Home.this, Tenggorokan.class);
                startActivity(prodi);
            }
        });

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profil = new Intent(Home.this, hidung.class);
                startActivity(profil);
            }
        });

        akademik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent akademik = new Intent(Home.this, mata.class);
                startActivity(akademik);
            }
        });

        pendaftaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pendaftaran = new Intent(Home.this, gigi.class);
                startActivity(pendaftaran);
            }
        });

        beasiswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beasiswa = new Intent(Home.this, mulut.class);
                startActivity(beasiswa);
            }
        });


    }
}





