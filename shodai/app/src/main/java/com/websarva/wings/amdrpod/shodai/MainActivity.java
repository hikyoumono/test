package com.websarva.wings.amdrpod.shodai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimerTask ti = new TimerTask() {
            @Override
            public void run() {
                Intent in = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(in);
            }
        };
        Timer t = new Timer();
        long d =3000;
        t.schedule(ti,d);

    }

}
