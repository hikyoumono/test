package com.websarva.wings.amdrpod.hairetu2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class hairetu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hairetu);

        ListView lvMenu =findViewById(R.id.lvMenu);
        List<String> menuList =new ArrayList<>();

        menuList.add("唐揚げ定食");
        menuList.add("ハンバーグ定食");
        menuList.add("生姜焼き定食");
        menuList.add("ステーキ定食");
        menuList.add("野菜炒め定食");
        menuList.add("とんかつ定食");
        menuList.add("ミンチかつ定食");
        menuList.add("チキンカツ定食");
        menuList.add("コロッケ定食");
        menuList.add("焼き魚定食");
        menuList.add("焼肉定食");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(hairetu.this,android.R.layout.simple_list_item_1,menuList);
        lvMenu.setAdapter(adapter);
    }
}
