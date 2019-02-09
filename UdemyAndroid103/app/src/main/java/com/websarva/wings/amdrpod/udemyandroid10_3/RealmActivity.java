package com.websarva.wings.amdrpod.udemyandroid10_3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmResults;

public class RealmActivity extends AppCompatActivity {
    Realm mrealm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realm);

        mrealm = Realm.getDefaultInstance();

        final TextView textView = findViewById(R.id.textView);
        Button create = findViewById(R.id.create);
        Button read = findViewById(R.id.read);
        Button update = findViewById(R.id.update);
        Button delete = findViewById(R.id.delete);
        Button back = findViewById(R.id.back);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mrealm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        //プライマリーキーだけ取得
                        Number max =realm.where(RealmDatabase.class).max("id");
                        long newId = 0;  //idがlong型だったから
                        if(max != null){ //nullなのは何も入っていなかったときのため
                            newId =max.longValue() + 1; //idのプラス1
                        }

                        RealmDatabase database = realm.createObject(RealmDatabase.class, newId);
                        database.date = new Date();
                        database.title = "登録テスト";
                        database.detail = "スケジュールの詳細情報";

                        textView.setText("登録しました\n" + database.toString());
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
                        RealmResults<RealmDatabase> database = realm.where(RealmDatabase.class).findAll();
                        for (RealmDatabase a : database) {
                            String text = textView.getText() + "\n" + a.toString();
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
                        RealmDatabase database = realm.where(RealmDatabase.class).equalTo("id", 0).findFirst();
                        database.title += "更新";
                        database.detail += "更新";

                        textView.setText("更新しました");
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
                        Number min = realm.where(RealmDatabase.class).min("id");
                        long id =0;
                        if(min != null){
                            id = min.longValue();
                        }

                        RealmDatabase database = realm.where(RealmDatabase.class).equalTo("id", id).findFirst();
                        database.deleteFromRealm();

                        textView.setText("削除しました");
                    }
                });
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
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
