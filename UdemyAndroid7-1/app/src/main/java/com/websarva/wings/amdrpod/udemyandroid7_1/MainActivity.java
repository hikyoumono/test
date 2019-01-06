package com.websarva.wings.amdrpod.udemyandroid7_1;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

    ImageSwitcher imageSwitcher;
    MediaPlayer mediaPlayer;
    //スライドする画像を番号付けしてまとめて格納
    int[] imageResouces={
            R.drawable.slide00,
            R.drawable.slide01,
            R.drawable.slide02,
            R.drawable.slide03,
            R.drawable.slide04,
            R.drawable.slide05,
            R.drawable.slide06,
            R.drawable.slide07,
            R.drawable.slide08,
            R.drawable.slide09
    };

    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageSwitcher =(ImageSwitcher)findViewById(R.id.imageSwitcher);
        //ImageSwitcher専用のアニメーションメソッド。前回のはimageview専用のアニメーションメソッド
        imageSwitcher.setInAnimation(MainActivity.this,android.R.anim.slide_in_left/*fade_in*/);
        imageSwitcher.setOutAnimation(MainActivity.this,android.R.anim.slide_out_right/*fade_out*/);

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                //Viewをドラッグアンドドロップではなく、プログラム上で作成
                ImageView imageView = new ImageView(MainActivity.this);
                return imageView;
            }
            //ImageSwitcherを使うときのパターンとして覚える
        });
        //イメージスイッチャーで画像を表示する方法とそのメソッド
        imageSwitcher.setImageResource(R.drawable.slide00);

        Button back =(Button)findViewById(R.id.back);
        Button next =(Button)findViewById(R.id.susumu);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movePosition(-1);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movePosition(1);
            }
        });

        //音響
        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.getdown);
        mediaPlayer.setLooping(true);
    }

    //画面が開かれたときに呼ばれるメソッド

    @Override
    protected void onResume() {
        super.onResume();
        mediaPlayer.start();
    }

    //画面が閉じられたときによばれるメソッド

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.stop();
    }

    private void movePosition(int move){
        position =position + move;
        //はみ出したときの処理
        if (position >= imageResouces.length){
            position = 0;
        }else if(position < 0){
            position = imageResouces.length - 1;
            //マイナスの値になると最後尾の画像に切り替える。まぁ、ここは9でもいけると思う。
        }
        //番号の画像選択
        imageSwitcher.setImageResource(imageResouces[position]);
    }
}
