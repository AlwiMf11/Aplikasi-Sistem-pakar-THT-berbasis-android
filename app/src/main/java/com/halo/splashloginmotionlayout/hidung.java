package com.halo.splashloginmotionlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import static android.view.View.GONE;

public class hidung extends AppCompatActivity {
    ViewGroup tcontainer1;
    ImageView tenggorokan1;


    TextView ya_1,no_1,te1,te2,te3,te4,te5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hidung);
        tcontainer1 = findViewById(R.id.teng1);
        tenggorokan1 = findViewById(R.id.tenggorokan1);
        ya_1 = findViewById(R.id.ya_1);
        no_1 = findViewById(R.id.no_1);
        te1 = findViewById(R.id.te1);
        te2 = findViewById(R.id.te2);
        te3 = findViewById(R.id.te3);
        te4 = findViewById(R.id.te4);
        te5 = findViewById(R.id.te5);
        tenggorokan1.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tcontainer1);
                visible = !visible;
                te1.setVisibility(visible ? View.VISIBLE: GONE);

            }
        });
        te1.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tcontainer1);
                visible = !visible;
                no_1.setVisibility(visible ? View.VISIBLE: GONE);
                ya_1.setVisibility(visible ? View.VISIBLE: GONE);
            }
        });
        ya_1.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tcontainer1);
                visible = !visible;
                te2.setVisibility(visible ? View.VISIBLE: View.GONE);

            }
        });
        no_1.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tcontainer1);
                visible = !visible;
                te3.setVisibility(visible ? View.VISIBLE: View.GONE);

            }
        });
        te2.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tcontainer1);
                visible = !visible;
                te4.setVisibility(visible ? View.VISIBLE: View.GONE);


            }
        });
        te3.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tcontainer1);
                visible = !visible;
                te5.setVisibility(visible ? View.VISIBLE: View.GONE);


            }
        });
    }}


