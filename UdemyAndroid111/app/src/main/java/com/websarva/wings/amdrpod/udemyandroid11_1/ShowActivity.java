package com.websarva.wings.amdrpod.udemyandroid11_1;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;

import io.realm.Realm;

public class ShowActivity extends AppCompatActivity {
    private Realm mRealm;
    private int[] images={R.drawable.image0,R.drawable.image1,R.drawable.image2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mRealm = Realm.getDefaultInstance();
        ImageView toolbarImage=(ImageView)findViewById(R.id.toolbarImage);
        TextView date = (TextView)findViewById(R.id.date);
        TextView detail = (TextView)findViewById(R.id.detail);
        CollapsingToolbarLayout layout =(CollapsingToolbarLayout)findViewById(R.id.toolbar_layout);

        //ScroollView呼び出し
        NestedScrollView scrollView = (NestedScrollView) findViewById(R.id.scrollView); //重大なエラーあり
        // content_showのスクロールビューと同じにする。同じようなR値が沢山あった為エラーにつながった。


        if(getIntent() != null){
            long mid = getIntent().getLongExtra("id",-1);
            Schedule sc = mRealm.where(Schedule.class).equalTo("id",mid).findFirst();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            String format =sdf.format(sc.date);
            date.setText(format);
            layout.setTitle(sc.title);
            detail.setText(sc.detail);
            toolbarImage.setImageResource(images[(int)mid %3]);


            //Bitmap取得
            Bitmap bitmap =((BitmapDrawable)toolbarImage.getDrawable()).getBitmap(); //使っているtoolbarImageを取り出し
            Palette palette = Palette.from(bitmap).generate();                       //パレットを使って画像の色を抽出

            //パレットから色を取得する
            int titleColor = palette.getLightVibrantColor(Color.WHITE);
            int bodyColor = palette.getDarkMutedColor(Color.BLACK);
            int scrimColor = palette.getMutedColor(Color.DKGRAY);
            int iconColor =palette.getVibrantColor(Color.LTGRAY);

            layout.setExpandedTitleColor(titleColor); //eee
            layout.setContentScrimColor(scrimColor);  //画像背景
            scrollView.setBackgroundColor(bodyColor); //本文背景
            detail.setTextColor(titleColor);          //本文文字
            fab.setBackgroundTintList(ColorStateList.valueOf(iconColor)); //Floatingbuttonのtintカラー
            /*layoutの種類一覧
             *これは画像から色を抽出する処理
             *変更箇所と含めて要チェック
             * setBackgroundTintListは返す引数の型に指定がある
             * 今回はmaxLinesとellipsizeを使用
             * textにlarge_textを使用
             * CardCornerRadiusに数値を入れて角を丸くする
             * appThameでMaterial Lightのパネルを指定しカードらしい見方ができるようにした
             * ListViewに@nullを設定
             * 最後にMaterialDesignをvaluesに作成
             */
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mRealm.close();
    }
}
