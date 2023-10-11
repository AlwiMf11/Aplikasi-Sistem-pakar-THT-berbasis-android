package com.halo.splashloginmotionlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class mata extends AppCompatActivity {
    ViewGroup matamata;
    TextView mata1,mata2,mata3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mata);

        mata1 =findViewById(R.id.mata1);
        mata2 =findViewById(R.id.mata2);
        mata3 =findViewById(R.id.mata3);

        mata1.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(matamata);
                visible = !visible;
                mata2.setVisibility(visible ? View.VISIBLE: View.GONE);

            }
        });

    }
}