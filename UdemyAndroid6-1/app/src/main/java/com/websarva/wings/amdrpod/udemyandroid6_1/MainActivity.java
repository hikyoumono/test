package com.websarva.wings.amdrpod.udemyandroid6_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.BounceInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //アニメーション
                ViewPropertyAnimator animator = imageView.animate();
                animator.setDuration(3000);
                animator.rotation(360.0f * 5.0f);
                animator.y(300.0f);
                //インターポレーター
                animator.setInterpolator(new BounceInterpolator /*OvershootInterpolator*/());

                /*
                Durationは間隔開けて実行。ミリ秒なので1000倍なのに注意。
                ・3秒間開けて
                rotationは回転。floatしか入らない
                ・360度回転で5回転

                他にも、
                ・alphaで透明度変更
                ・xで指定したx座標に移動(yも同様)
                ・scaleXでビューの幅、拡大縮小
                ・scaleYでビューの高さ、拡大縮小

                省略した書き方に注意
                imageView.animate().setDuration(3000).rotation(360.0f * 5.0f);

                setInterpolatorについて
                アニメーションのことをインターポレーターと呼ぶ。今回はBounceInterpolator。バウンドする感じがある。
                その他、インターポレーター種類一覧
                AccelerateInterporator
                AccelerateDecelerateInterporator
                DecelerateInterporator
                OvershootInterpolator
                LinearInterpolator
                 */


            }
        });
    }
}
