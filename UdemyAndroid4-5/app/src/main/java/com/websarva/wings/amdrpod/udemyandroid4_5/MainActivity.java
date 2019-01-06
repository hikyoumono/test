package com.websarva.wings.amdrpod.udemyandroid4_5;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

import static com.websarva.wings.amdrpod.udemyandroid4_5.R.id.progressBar;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    webView.loadUrl("http://www.google.co.jp/");
                    return true;
                case R.id.navigation_dashboard:
                    webView.loadUrl("https://ouc.saai-mas.jp/");
                    return true;
                case R.id.navigation_notifications:
                    webView.loadUrl("http://www.google.co.jp/");
                    return true;
                case R.id.navigation_back:
                    //戻るボタン
                    webView.goBack();
                    //これだけで可
                    return true;
                case R.id.navigation_forward:
                    //進むボタン
                    webView.goForward();
                    //これだけで可
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        webView = (WebView)findViewById(R.id.webView);
        final ProgressBar progressBar =(ProgressBar)findViewById(R.id.progressBar);
        progressBar.setVisibility(View.INVISIBLE);
        //ブラウザ起動抑える
        webView.setWebViewClient(new WebViewClient(){
            //page読み込み
            @Override
           public void onPageStarted(WebView view, String url, Bitmap favicon){
               super.onPageStarted(view,url,favicon);
                progressBar.setVisibility(View.VISIBLE);
           }
            //page読み込み終わった
            @Override
            public void onPageFinished(WebView view,String url){
                super.onPageFinished(view,url);
                progressBar.setVisibility(View.INVISIBLE);
            }
        });
        //JavaScript有効
        webView.getSettings().setJavaScriptEnabled(true);
    }

}
