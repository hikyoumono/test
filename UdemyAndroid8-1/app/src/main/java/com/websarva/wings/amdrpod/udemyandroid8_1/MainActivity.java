package com.websarva.wings.amdrpod.udemyandroid8_1;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.Image;
import android.media.SoundPool;
import android.os.Build;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SoundEffectConstants;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    TextView timerText;
    ImageView startButton;
    ImageView stopButton;
    SoundPool sound;
    int soundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timerText = (TextView)findViewById(R.id.timer_text);
        startButton = (ImageView)findViewById(R.id.timer_start);
        stopButton = (ImageView)findViewById(R.id.timer_stop);

        final CountDownTimer timer = new CountDownTimer(3 * 60 * 1000,/*下のメソッドをインターバルで呼び出す*/100) {
            //指定した間隔で実行処理
            @Override
            public void onTick(long l) {
                //カウントダウンの表示を更新させる
                long hun = l / 1000 / 60;//long l はまたミリ秒
                long byou =l / 1000 % 60;

                timerText.setText(String.format("%1$d:%2$02d",hun,byou));
                /*formatとは
                数値を当てはめて表示させるメソッド
                ・%書式
                ・1$で1番目、2$で2番目
                ・dは整数、02dとすることで2桁表示させる
                という意味
                 */
            }
            //時間が来たときのメソッド
            @Override
            public void onFinish() {
                timerText.setText("0:00");
                sound.play(soundId,1.0f,1.0f,0,/*SoundPool専用のloop回数　※－1にするとどこまでもloopする*/0,1.0f);
            }
        };
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer.start();
            }
        });
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer.cancel();
                sound.stop(soundId);
                //これでメソッドの更新が一時中断できる
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Versionがもし足りていればの処理
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {//Error画面のSround withを選択した
            sound = new SoundPool.Builder()
                    .setMaxStreams(1) //同時に再生できる音源の限界
                    .setAudioAttributes(new AudioAttributes.Builder()
                            .setUsage(AudioAttributes.USAGE_ALARM).build())
                    .build();
        }else{
            sound = new SoundPool(1, AudioManager.STREAM_ALARM,0);
        }
        soundId = sound.load(this,R.raw.bellsound,1);//1は優先順位
    }

    @Override
    protected void onPause() {
        super.onPause();
        sound.release();
    }
}
//今回自動でスリープ状態にさせないためにkeepScreanOnにチェックを入れた
//さらにTintで画像(ベクター)の色を設定した。