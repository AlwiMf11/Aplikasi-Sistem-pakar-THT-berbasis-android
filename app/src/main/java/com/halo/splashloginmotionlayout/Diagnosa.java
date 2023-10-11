package com.halo.splashloginmotionlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Diagnosa extends AppCompatActivity {
    ViewGroup diag1;



    TextView dg1,dg2,dg3,dg4,dg5,dg6,dg7,dg8,dg9,dg10,dg11,dg12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);
        diag1 = findViewById(R.id.diagnos1);
        dg1 = findViewById(R.id.dg1);
        dg2 = findViewById(R.id.dg2);
        dg3 = findViewById(R.id.dg3);
        dg4 = findViewById(R.id.dg4);
        dg5 = findViewById(R.id.dg5);
        dg6 = findViewById(R.id.dg6);
        dg7 = findViewById(R.id.dg7);
        dg8 = findViewById(R.id.dg8);
        dg9 = findViewById(R.id.dg9);
        dg10 = findViewById(R.id.dg10);
        dg11 = findViewById(R.id.dg11);
        dg12 = findViewById(R.id.dg12);




        dg1.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(diag1);
                visible = !visible;
                dg2.setVisibility(visible ? View.VISIBLE: View.GONE);


            }

        });
        dg3.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(diag1);
                visible = !visible;
                dg4.setVisibility(visible ? View.VISIBLE: View.GONE);


            }

        });
        dg5.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(diag1);
                visible = !visible;
                dg6.setVisibility(visible ? View.VISIBLE: View.GONE);


            }

        });
        dg7.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(diag1);
                visible = !visible;
                dg8.setVisibility(visible ? View.VISIBLE: View.GONE);


            }

        });
        dg9.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(diag1);
                visible = !visible;
                dg10.setVisibility(visible ? View.VISIBLE: View.GONE);


            }

        });
        dg11.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(diag1);
                visible = !visible;
                dg12.setVisibility(visible ? View.VISIBLE: View.GONE);


            }

        });}}