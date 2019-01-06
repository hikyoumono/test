package com.websarva.wings.amdrpod.udemyandroid1_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.websarva.wings.amdrpod.udemyandroid1_2.R.id.textView;

public class MainActivity extends AppCompatActivity {
    //ここにも定義できる
int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count =0;
        count = 1 + 1;
        //Log.dはコンソールに表示
        Log.d("countの値","値は"+ count +"です");

        Button tapHere2 = (Button) findViewById(R.id.tapHere2);
        //クリックしたときのリスナ
        tapHere2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TextView textviewed = (TextView) findViewById(R.id.textView);
                textviewed.setText("ボタンがクリックされました");
            }
        });
    }

    public void onClickButton(View view){
        TextView textView =(TextView) findViewById(R.id.textView);
        textView.setText("ボタンがタップされました");
    }

}
