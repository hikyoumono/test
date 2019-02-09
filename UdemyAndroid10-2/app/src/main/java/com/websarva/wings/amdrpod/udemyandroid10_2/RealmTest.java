package com.websarva.wings.amdrpod.udemyandroid10_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmResults;

public class RealmTest extends AppCompatActivity {
    Realm mrealm;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realm_test);
        mrealm = Realm.getDefaultInstance();

        textView = (TextView) findViewById(R.id.textView);

        Button create = (Button) findViewById(R.id.create);
        Button read = (Button) findViewById(R.id.read);
        Button update = (Button) findViewById(R.id.update);
        Button delete = (Button) findViewById(R.id.delete);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mrealm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        Schedule sc = realm.createObject(Schedule.class, 0);
                        sc.date = new Date;
                        sc.title = "登録テスト";
                        sc.detail = "スケジュールの詳細情報";

                        textView.setText("登録しました\n" + sc.toString());
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
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
mrealm.executeTransaction(new Realm.Transaction() {
    @Override
    public void execute(Realm realm) {
        Schedule sc = realm.where(Schedule.class).equalTo("id",0).findFirst();
        sc.deleteFromRealm();
        textView.setText("削除" + textView.getText());
    }
});
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mrealm.close();
    }
}
