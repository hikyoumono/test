package com.websarva.wings.amdrpod.udemyandroid5_1;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposePathEffect;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.PorterDuff;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import static android.R.attr.tag;

public class MainActivity extends AppCompatActivity implements SensorEventListener ,SurfaceHolder.Callback{
SensorManager mSensorManager;
Sensor mAccSensor;

    SurfaceHolder mHolder;
    int mSurfaceWidth; //surface幅
    int mSurfaceHeight; //surface高さ

    static final float radius= 150.0f; //ボールの大きさ(半径)
    static final int DIA = (int) radius * 2;
    static final float coef= 1000.0f;  //ボールの速度

    float mBallX; //ボールの現在のX座標
    float mBallY; //ボールの現在のY座標
    float mVX;    //ボールのX軸方向への初速度
    float mVY;    //ボールのY軸方向への初速度

    long mT0;     //ひとコマ前の時間

    Bitmap mBallBitmap; //ボールの画像

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //端末の向きを縦方向に固定する
        setContentView(R.layout.activity_main);

        mSensorManager =(SensorManager)getSystemService(Context.SENSOR_SERVICE);
        //センサー取得
        mAccSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        //センサーの種類を取得するメソッド
        //加速度センサー取得

        SurfaceView surfaceview =(SurfaceView)findViewById(R.id.surfaceView);
        mHolder = surfaceview.getHolder(); //これでインスタンス化

        mHolder.addCallback(this); //Callback更新用

        mHolder.setFormat(PixelFormat.TRANSLUCENT);//TRANSLUCENTは透明という意味
        surfaceview.setZOrderOnTop(true);

        //ボールの画像用意
        Bitmap ball = BitmapFactory.decodeResource(getResources(),R.drawable.ball);
        mBallBitmap = Bitmap.createScaledBitmap(ball, DIA, DIA, false);//サイズ
        //コツ：　Bitmapのメソッドで画像を編集しきったものをクラスメンバに代入する
    }

    //加速度センサーの値に変化があったときによばれるメソッド
    @Override
    public void onSensorChanged(SensorEvent event) {

        if(event.sensor.getType()==Sensor.TYPE_ACCELEROMETER){
            float x = -event.values[0]; //x軸方向への傾き、描画方向を合わせるために-を付けて反転
            float y =event.values[1];   //y軸方向への傾き

            if(mT0 ==0){
                mT0 =event.timestamp;
                return;
            }
            float t =event.timestamp - mT0;
            mT0 =event.timestamp;
            t =t/ 1000000000.0f;

            //t秒後の移動距離
            float dx =(mVX * t) + (x * t * t / 2.0f);
            float dy =(mVY * t) + (y * t * t / 2.0f);
            //☝を基にボールの位置を記録して更新
            mBallX = mBallX + dx * coef;
            mBallY = mBallY + dy * coef;
            //速度更新
            mVX= mVX + (x * t);
            mVY= mVY + (y * t);

            //ボールが壁にぶつかった時の処理
            if(mBallX - radius < 0 && mVX > 0){
                mVX = -mVX / 1.5f;
                mBallX = radius;
            }else if(mBallX + radius > mSurfaceWidth && mVX > 0){
                mVX = -mVX / 1.5f;
                mBallX = mSurfaceWidth - radius;
            }
            if(mBallY - radius < 0 && mVY > 0){
                mVY = -mVY / 1.5f;
                mBallY = radius;
            }else if(mBallY + radius > mSurfaceHeight && mVY > 0){
                mVY = -mVY / 1.5f;
                mBallY = mSurfaceHeight - radius;
            }
            drawCamvas();
            //Log.d("加速器","x=" + event.values[0] + "y=" + event.values[1] + "z=" + event.values[2]);
        }
    }

    private void drawCamvas() {
        //画面にボールを表示する処理
        Canvas c = mHolder.lockCanvas();
        c.drawColor(Color.TRANSPARENT, PorterDuff.Mode.CLEAR);
        //第一引数は色、第二引数は前回の一コマ前のサーフェスを消す処理
        Paint paint = new Paint();
        c.drawBitmap(mBallBitmap,mBallX - radius , mBallY -radius, paint);
        //表示したいBitmap、横座標、縦座標、paintはフレームになる
        mHolder.unlockCanvasAndPost(c);
        //最初にキャンバスがロックされて最後にアンロックされるところに注目
    }

    //加速度センサーの制度が変更されたときに呼ばれるメソッド
    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }



    @Override
    //画面が表示されたときに呼び出される
    protected void onResume() {
        super.onResume();


    }

    @Override
    //画面を閉じたときに呼び出される
    protected void onPause() {
        super.onPause();

    }

    @Override
    //surfaceが開始されたときに呼び出される
    public void surfaceCreated(SurfaceHolder holder) {
        //加速度センサーの監視を始めることができる。要するにセンサーの実行メソッドになる
        mSensorManager.registerListener(this,mAccSensor,SensorManager.SENSOR_DELAY_GAME);
        //引数1つ目でこのクラスの画面にと指定している
        //引数2つ目は監視を行いたいセンサー
        //引数3つ目は監視を行う頻度
    }

    @Override
    //surfaceに変更があったときに呼ばれるメソッド
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        //引数のwidth,heightはsurfaceの大きさを表す
        mSurfaceHeight =height;
        mSurfaceWidth =width;

        mBallX = mSurfaceWidth /2;
        mBallY = mSurfaceHeight /2;

        mVX =0;
        mVY =0;
        mT0 =0;
    }

    @Override
    //surfaceが破棄されたときに呼び出される
    public void surfaceDestroyed(SurfaceHolder holder) {
        //センサーの解除
        mSensorManager.unregisterListener(this);
    }
}
