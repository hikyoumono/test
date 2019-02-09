package com.websarva.wings.amdrpod.udemyandroid11_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {
    private Realm mrealm;
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mrealm = Realm.getDefaultInstance();
        list = (ListView) findViewById(R.id.list);
        RealmResults<Schedule> schedules = mrealm.where(Schedule.class).findAll();
        ScheduleAdapter adapter = new ScheduleAdapter(schedules);

        list.setAdapter(adapter);

        Button dbTest = (Button) findViewById(R.id.dbtestbutton);
        dbTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RealmTestActivity.class);
                startActivity(intent);
            }
        });
        FloatingActionButton add = (FloatingActionButton) findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            //app:srcComatにエラーがついているが問題なく動くためスルー
            @Override
            public void onClick(View v) {
                final long[] newId = new long[1];
                mrealm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        Number num = realm.where(Schedule.class).max("id");
                        newId[0] = 0;
                        if (num != null) {
                            newId[0] = num.longValue() + 1;
                        }
                        Schedule sc = realm.createObject(Schedule.class, newId[0]);
                        sc.date = new Date();
                        sc.title = "";
                        sc.detail = "";
                    }
                });
                Intent i = new Intent(MainActivity.this, inputActivity.class);
                i.putExtra("id", newId[0]);
                startActivity(i);
            }
        });
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                ScheduleAdapter adapter = (ScheduleAdapter) list.getAdapter();
                Schedule sc = adapter.getItem(position);
                Intent i = new Intent(MainActivity.this, ShowActivity.class);
                i.putExtra("id", sc.id);
                //でかいミス発生！そしててこずった！putExtraのnameはgetExtraと揃えること。大文字小文字まできっちりと。
                startActivity(i);
            }
        });
        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                ScheduleAdapter adapter = (ScheduleAdapter) list.getAdapter();
                final Schedule sc = adapter.getItem(position);//データベースからposition取得。select文の代わりになる
                mrealm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        sc.deleteFromRealm();
                    }
                });
                Snackbar.make(view,"削除しました",Snackbar.LENGTH_LONG)
                        .setAction("OK", new View.OnClickListener() { //スナックバーはアクションを追加できる
                            @Override
                            public void onClick(View v) {
                                Snackbar.make(v,"OKが押された時の処理",Snackbar.LENGTH_SHORT).show();
                                //Snackbar→make()→show()の流れを覚えておく
                            }
                        })
                        .show(); //びっくりしたから何か出てきた
                return true;
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mrealm.close();
    }
}
