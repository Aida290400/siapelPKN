package com.example.siapel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pendaftaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pendaftaran);
        Button btnmasuk = (Button) findViewById(R.id.button_login);
        btnmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b_login = new Intent(pendaftaran.this,login.class);
                startActivity(b_login);
            }
        });
        Button btndaftar = (Button) findViewById(R.id.button_register);
        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b_register = new Intent(pendaftaran.this,register.class);
                startActivity(b_register);
            }
        });

    }
}