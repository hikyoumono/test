package com.websarva.wings.amdrpod.udemyandroid10_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmResults;

public class RealmTest extends AppCompatActivity {

    Realm mRealm;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realm_test);

        //データベースのオープン処理
        mRealm =Realm.getDefaultInstance();

        mTextView =(TextView)findViewById(R.id.textView);
        Button create =(Button)findViewById(R.id.create);
        final Button read =(Button)findViewById(R.id.read);
        Button update =(Button)findViewById(R.id.update);
        Button delete =(Button)findViewById(R.id.delete);


        //クリエイトボタンでクリエイト
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mRealm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        Scedule scedule = realm.createObject(Scedule.class,/*primarykey*/ 0);
                        scedule.date = new Date();
                        scedule.title ="登録テスト";
                        scedule.detail ="スケジュールの詳細情報";

                        //保存するスケジュールを表示
                        mTextView.setText("登録しました\n" + scedule.toString());
                        //Objectの内容をStringで表示する
                    }
                });
            }
        });

        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mRealm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        RealmResults<Scedule> scedule=realm.where(Scedule.class).findAll();
                        //whereで検索したいモデル(テーブル的な存在)を入れる
                        //findAllでその検索条件にあてはまるものを取得するメソッド
                        //※リストで格納
                        
                        mTextView.setText("取得");
                        for (Scedule s :scedule) {
                            String text =mTextView.getText() + "\n"
                                    + s.toString();
                            mTextView.setText(text);
                        }
                    }
                });
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mRealm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        Scedule scedule = realm.where(Scedule.class)
                                .equalTo("id",0)
                                .findFirst();//最初の一件だけを返すメソッド

                        scedule.title +="＜更新＞";
                        scedule.detail +="＜更新＞";

                        mTextView.setText("更新しました\n" + scedule.toString());

                    }
                });
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mRealm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        Scedule scedule =realm.where(Scedule.class)
                                .equalTo("id",0)
                                .findFirst();

                        scedule.deleteFromRealm();

                        mTextView.setText("削除しました\n" + scedule.toString());
                    }
                });
            }
        });

        Button back = (Button)findViewById(R.id.back);
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
        //アプリを閉じるときにデータベースを閉じる
        mRealm.close();
    }
}
