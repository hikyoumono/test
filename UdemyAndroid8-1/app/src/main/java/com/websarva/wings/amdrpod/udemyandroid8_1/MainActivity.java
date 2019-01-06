package com.websarva.wings.amdrpod.udemyandroid8_1;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView timerText;
    ImageView startButton;
    ImageView stopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timerText = (TextView)findViewById(R.id.timer_text);
        startButton = (ImageView)findViewById(R.id.timer_start);
        stopButton = (ImageView)findViewById(R.id.timer_stop);
    }
}
