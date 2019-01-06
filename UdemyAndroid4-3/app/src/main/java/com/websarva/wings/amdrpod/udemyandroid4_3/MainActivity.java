package com.websarva.wings.amdrpod.udemyandroid4_3;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTextMessage;
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
                    webView.loadUrl("http://ouc.saai-mas.jp/");
                    return true;
                case R.id.navigation_notifications:
                    webView.loadUrl("http://www.google.co.jp/");
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        //Webのセッティング
        webView = (WebView)findViewById(R.id.webView);
        //タップしたときにブラウザの起動を抑える
        webView.setWebViewClient(new WebViewClient());
        //JavaScript有効
        webView.getSettings().setJavaScriptEnabled(true);
    }

}
