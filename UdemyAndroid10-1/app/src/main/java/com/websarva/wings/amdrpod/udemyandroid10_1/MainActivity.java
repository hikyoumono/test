package com.websarva.wings.amdrpod.udemyandroid10_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {
    Realm mRealm;
    ListView mlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRealm = Realm.getDefaultInstance();
        mlist = (ListView) findViewById(R.id.list);
        RealmResults<Scedule> h = mRealm.where(Scedule.class).findAll();
        final ScheduleAdapter adapter = new ScheduleAdapter(h);
        mlist.setAdapter(adapter); //ListView使うには必須のメソッド


        Button dbTest = (Button) findViewById(R.id.db_test);
        dbTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RealmTest.class);
                startActivity(intent);
            }
        });
        //FloatingActionを押したときの処理
        FloatingActionButton f = findViewById(R.id.add);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final long[] newId = new long[1];
                mRealm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        Number max = realm.where(Scedule.class).max("id"); //idの時はNumber
                        newId[0] = 0;
                        if (max != null) {
                            newId[0] = max.longValue() + 1;
                        }
                        Scedule s = realm.createObject(Scedule.class, newId[0]);
                        s.date = new Date();
                        s.title = "";
                        s.detail = "";
                    }
                });
                Intent i = new Intent(MainActivity.this, inputActivity.class);
                //IDという名前で受け渡し
                i.putExtra("id", newId[0]);
                startActivity(i);
            }
        });
        //listを開くようにする
        mlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                ScheduleAdapter adapter2 =(ScheduleAdapter) mlist.getAdapter();
                Scedule toast =adapter2.getItem(position);
                Intent intent =new Intent(MainActivity.this,inputActivity.class);
                intent.putExtra("id",toast.id);
                startActivity(intent);
            }
        });
        mlist.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long l) {
                ScheduleAdapter adapter3 =(ScheduleAdapter)mlist.getAdapter();
                final Scedule toast =adapter3.getItem(position);
                mRealm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        toast.deleteFromRealm();
                    }
                });
                return true; //trueにしておく
            }
        });
    }
}
