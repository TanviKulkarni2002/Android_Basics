package com.example.tank_android_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Second_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Song Insertion
//        MediaPlayer mp=MediaPlayer.create(this,R.raw.bts_silver_spoon_song);
//        mp.start();

        //Pic Animate
//        ImageView imv=findViewById(R.id.imageView);
//        Animation anim= AnimationUtils.loadAnimation(this,R.anim.first_anim);
//        imv.startAnimation(anim);
    }
}