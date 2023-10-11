package com.halo.splashloginmotionlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class mulut extends AppCompatActivity {
    ViewGroup tcontainer;
    ImageView mulut1;


    TextView tt,ya,no,pp,p1,p2,p3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulut);

        tcontainer = findViewById(R.id.memek);
        mulut1 = findViewById(R.id.mulut1);
        ya = findViewById(R.id.ya);
        no = findViewById(R.id.no);
        pp = findViewById(R.id.pp);
        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
        p3 = findViewById(R.id.p3);
        tt = findViewById(R.id.tt);

        mulut1.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tcontainer);
                visible = !visible;
                tt.setVisibility(visible ? View.VISIBLE: View.GONE);

            }
        });









        tt.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tcontainer);
                visible = !visible;
                ya.setVisibility(visible ? View.VISIBLE: View.GONE);
                no.setVisibility(visible ? View.VISIBLE: View.GONE);


            }

        });
        ya.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tcontainer);
                visible = !visible;
                pp.setVisibility(visible ? View.VISIBLE: View.GONE);

            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tcontainer);
                visible = !visible;
                p1.setVisibility(visible ? View.VISIBLE: View.GONE);

            }
        });
        pp.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tcontainer);
                visible = !visible;
                p2.setVisibility(visible ? View.VISIBLE: View.GONE);


            }
        });
        p1.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tcontainer);
                visible = !visible;
                p3.setVisibility(visible ? View.VISIBLE: View.GONE);


            }
        });
    }}
