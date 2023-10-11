package com.halo.splashloginmotionlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import static android.view.View.GONE;

public class Tenggorokan extends AppCompatActivity {
    ViewGroup tcontainer2;
    ImageView hidung1;


    TextView hidung2,hidung3,hidung4,hidung5,hidung6,hidung7,hidung8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenggorokan);
        tcontainer2 = findViewById(R.id.lnhidung);
        hidung1 = findViewById(R.id.hidung1);
        hidung2 = findViewById(R.id.hidung2);
        hidung3 = findViewById(R.id.hidung3);
        hidung4 = findViewById(R.id.hidung4);
        hidung5 = findViewById(R.id.hidung5);
        hidung6 = findViewById(R.id.hidung6);
        hidung7 = findViewById(R.id.hidung7);
        hidung8 = findViewById(R.id.hidung8);
        hidung1.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tcontainer2);
                visible = !visible;
                hidung2.setVisibility(visible ? View.VISIBLE: GONE);

            }
        });
        hidung2.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tcontainer2);
                visible = !visible;
                hidung3.setVisibility(visible ? View.VISIBLE: GONE);
                hidung4.setVisibility(visible ? View.VISIBLE: GONE);
            }
        });
        hidung3.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tcontainer2);
                visible = !visible;
                hidung5.setVisibility(visible ? View.VISIBLE: View.GONE);

            }
        });
        hidung4.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tcontainer2);
                visible = !visible;
                hidung6.setVisibility(visible ? View.VISIBLE: View.GONE);

            }
        });
        hidung5.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tcontainer2);
                visible = !visible;
                hidung7.setVisibility(visible ? View.VISIBLE: View.GONE);


            }
        });
        hidung6.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tcontainer2);
                visible = !visible;
                hidung8.setVisibility(visible ? View.VISIBLE: View.GONE);


            }
        });
    }}