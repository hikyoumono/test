package com.websarva.wings.amdrpod.debagproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int result;
        result = calc(3);
        Log.d("re","結果は" + result);

        
    }
    private int calc(int x){
        int result =0;
        for(int i = 1; i<=x; i++){
            result += i;
        }
        return result;
    }
}
