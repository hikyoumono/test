package com.websarva.wings.amdrpod.listviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewSampleActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_sample);

        ListView lvMenue = findViewById(R.id.lvMenue);

        ListItemClickListener li = new ListItemClickListener();

        lvMenue.setOnItemClickListener(li);
    }

    //リストがタップされたとき専用のクラス  ※ボタンの時と違うクラスなことに着目
    private class ListItemClickListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view,int position,long id){
            //タップされた定食名取得
            String item = (String)parent.getItemAtPosition(position);
            //文字列作成
            String show = "あなたが選んだ定食は" + item;
            //トーストの表示
            Toast.makeText(ListViewSampleActivity.this,show,Toast.LENGTH_LONG).show();

        }
    }
}
