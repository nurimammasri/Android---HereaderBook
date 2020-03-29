package com.app.hereaderbook;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;


public class AboutActivity extends AppCompatActivity {
    //untuk backgroun animasi
    LinearLayout linearLayout;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        CircleImageView img_about_foto;

        img_about_foto = findViewById(R.id.img_about_foto);

        img_about_foto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Nice :)", Toast.LENGTH_SHORT).show();
            }
        });

        //untuk background about animasi
        setContentView(R.layout.activity_about);
        linearLayout = (LinearLayout) findViewById(R.id.linearlayout);
        animationDrawable = (AnimationDrawable) linearLayout.getBackground();

        animationDrawable.setEnterFadeDuration(5000);
        animationDrawable.setExitFadeDuration(2000);
    }

    //untuk background about animasi
    @Override
    protected void onPause() {
        super.onPause();

        if (animationDrawable != null && animationDrawable.isRunning()){
            animationDrawable.stop();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (animationDrawable != null && !animationDrawable.isRunning()){
            animationDrawable.start();
        }
    }
    //sampai disini

}

