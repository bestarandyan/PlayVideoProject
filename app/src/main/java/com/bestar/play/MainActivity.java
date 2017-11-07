package com.bestar.play;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bestar.play.video.SampleVideo;

public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.startPlayVideo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent appIntent = new Intent(MainActivity.this,VideoPlayActivity.class);
                appIntent.putExtra("videoPath","");
                startActivity(appIntent);
            }
        });
    }
}
