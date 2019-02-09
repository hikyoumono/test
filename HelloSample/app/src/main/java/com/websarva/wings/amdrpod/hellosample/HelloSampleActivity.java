package com.websarva.wings.amdrpod.hellosample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloSampleActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_sample);

        Button btClick = findViewById(R.id.btClick);
        Button btClear = findViewById(R.id.btClear);

        HelloListener listener = new HelloListener();

        btClick.setOnClickListener(listener);
        btClear.setOnClickListener(listener);
    }



//ボタンをクリックした時のリスナクラス
private class HelloListener implements View.OnClickListener{
    @Override
    public void onClick(View view) {
        //名前入力欄であるEditTextオブジェクトを取得
        EditText input = findViewById(R.id.etName);
        //メッセージを表示するTextViewオブジェクトを取得
        TextView output = findViewById(R.id.tvOutput);

        //タップされた部品のidを取得
        int id = view.getId();
        //idのR値によって処理を分岐させる
        switch(id){
            case R.id.btClick:
            //入力された名前文字列を取得
            String inputStr = input.getText().toString();
            //メッセージを表示する
            output.setText(inputStr + "さんこんにちは！");
            break;

            //クリアボタンの処理
            case R.id.btClear:
            //名前入力欄を空文字に設定
            input.setText("");
            //メッセージ表示ランを空文字に設定
            output.setText("");
            break;
        }





    }
    }
}
