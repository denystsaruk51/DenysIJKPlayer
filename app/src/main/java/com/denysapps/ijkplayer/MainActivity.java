package com.denysapps.ijkplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        VideoActivity.intentTo(this,"https://videodelivery.net/b9403999dfdc450204c91f75cea7227a/manifest/video.mpd", "Test");
        VideoActivity.intentTo(this,"https://videodelivery.net/b9403999dfdc450204c91f75cea7227a/manifest/video.m3u8", "Test");
//        VideoActivity.intentTo(this,"http://www.bok.net/dash/tears_of_steel/cleartext/stream.mpd", "Test");
    }
}
