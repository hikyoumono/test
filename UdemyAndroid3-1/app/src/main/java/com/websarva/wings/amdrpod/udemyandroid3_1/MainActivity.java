package com.websarva.wings.amdrpod.udemyandroid3_1;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final int gu = 0;
    private final int choki = 1;
    private final int pa = 2;

    int janken[] = new int[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton guButton = (ImageButton)findViewById(R.id.gu);
        ImageButton chokiButton=(ImageButton)findViewById(R.id.choki);
        ImageButton paButton =(ImageButton)findViewById(R.id.pa);

        guButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                janken[gu] = janken[gu] + 1;
                kaisu();
            }
        });
        chokiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                janken[choki] = janken[choki] + 1;
                kaisu();
            }
        });
        paButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                janken[pa] =janken[pa] + 1;
                kaisu();
            }
        });
    }

    private void kaisu(){
        TextView textview = (TextView)findViewById(R.id.mess);
        textview.setText(janken[gu] + "," + janken[choki] + "," + janken[pa]);
        int sum =0;

        /*for(int i =0; i <3; i++){
        sum =sum + janken[i];
            TextView textview2 =(TextView)findViewById(R.id.goukei);
            textview2.setText("合計" + sum);
        }*/

        for(int num : janken){
            sum += num;
        }
        TextView textview2 =(TextView)findViewById(R.id.goukei);
        textview2.setText("合計" + sum);

    }
}
