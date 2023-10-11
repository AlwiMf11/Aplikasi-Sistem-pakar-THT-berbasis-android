package com.halo.splashloginmotionlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_Splash_Login extends AppCompatActivity implements View.OnClickListener {
    public EditText us, ps;
    public Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_login);

        us = findViewById(R.id.edt_us);
        ps = findViewById(R.id.edt_ps);
        btnlogin = findViewById(R.id.btn_login);
        btnlogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View View) {
     if (View.getId()== R.id.btn_login) {
         String user = us.getText().toString().trim();
         String pasw = ps.getText().toString().trim();

         if (user.equals("p")&& pasw.equals("1")) {
             Toast.makeText(this, "Selamat, login Sukses", Toast.LENGTH_SHORT).show();
             Intent intent = new Intent(Activity_Splash_Login.this, tampilan.class);
             startActivity(intent);
         }else{
             Toast.makeText(this,"username atau password salah",Toast.LENGTH_SHORT).show();

         }
        }
    }
}