package com.faith.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.faith.myapplication.audio.StartAudioActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initClick();
    }

    private void initClick() {
        findViewById(R.id.music).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), StartAudioActivity.class));
           /* MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.music01);
            mediaPlayer.setOnCompletionListener(mp -> {
                mp.release();
                mp = null;
            });
            if (!mediaPlayer.isPlaying()) {
                mediaPlayer.start();
            } else {
                mediaPlayer.release();
                mediaPlayer = null;
            }*/
        });
    }
}
