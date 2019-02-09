package com.websarva.wings.amdrpod.udemyandroid11_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmResults;

public class RealmTestActivity extends AppCompatActivity {
    TextView textView;
    Realm mrealm;
    Button create;
    Button read;
    Button update;
    Button delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realm_test);

        mrealm = Realm.getDefaultInstance();

        textView = findViewById(R.id.textView);
        create = findViewById(R.id.create);
        read = findViewById(R.id.read);
        update = findViewById(R.id.update);
        delete = findViewById(R.id.delete);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mrealm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        Number num =realm.where(Schedule.class).max("id");
                        long newId =0;
                        if(num != null){
                            newId =num.longValue() +1;
                        }

                        Schedule sc = realm.createObject(Schedule.class, newId);
                        sc.date = new Date();
                        sc.title = "登録テスト";
                        sc.detail = "スケジュールの詳細情報";

                        textView.setText("取得しました\n" + sc.toString());
                    }
                });
            }
        });
        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mrealm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        RealmResults<Schedule> sc = realm.where(Schedule.class).findAll();
                        textView.setText("取得");
                        for (Schedule s : sc) {
                            String text = textView.getText() + "\n" + sc.toString();
                            textView.setText(text);
                        }
                    }
                });
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mrealm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        Schedule sc = realm.where(Schedule.class).equalTo("id", 0).findFirst();
                        sc.title = "更新";
                        sc.detail = "更新";
                        textView.setText("更新\n" + sc.toString());
                    }
                });
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mrealm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        Number num =realm.where(Schedule.class).min("id");
                        if(num != null) {
                            Schedule sc = realm.where(Schedule.class).equalTo("id", num.longValue()).findFirst();
                            sc.deleteFromRealm();
                            textView.setText("削除" + textView.getText());
                        }
                    }
                });
            }
        });

        Button button = findViewById(R.id.back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mrealm.close();
    }
}
