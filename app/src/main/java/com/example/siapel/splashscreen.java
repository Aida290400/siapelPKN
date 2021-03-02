package com.example.siapel;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splashscreen extends AppCompatActivity {
    private static int SPLASH_SCREEN=3000;
//variabel
    Animation topAnim, bottomAnim;
    ImageView image;
    TextView nama, napp, kota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splashscreen);

        //Animations
        topAnim= AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim= AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        //Hooks
        image=findViewById(R.id.imageView);
        nama=findViewById(R.id.textView2);
        napp=findViewById(R.id.textView3);
        kota=findViewById(R.id.textView4);


        image.setAnimation(topAnim);
        nama.setAnimation(bottomAnim);
        napp.setAnimation(bottomAnim);
        kota.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splashscreen.this,pendaftaran.class);
                splashscreen.this.startActivity(i);
                splashscreen.this.finish();
            }
        }, SPLASH_SCREEN);
    }
}