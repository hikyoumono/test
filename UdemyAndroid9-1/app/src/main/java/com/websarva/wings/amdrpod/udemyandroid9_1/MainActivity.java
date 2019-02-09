package com.websarva.wings.amdrpod.udemyandroid9_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Car redCar = new SafeCar();
    Button up;
    Button down;
    TextView speed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        up = (Button) findViewById(R.id.speedUp);
        down = (Button) findViewById(R.id.speedDown);
        speed = (TextView) findViewById(R.id.speed);

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redCar.speedUp();
                speed.setText(redCar.getInfo() + "の速度は" + redCar.getSpeed() + "km");
            }
        });
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redCar.speedDown();
                speed.setText(redCar.getInfo() + "の速度は" + redCar.getSpeed() + "km");
            }
        });
    }
}
