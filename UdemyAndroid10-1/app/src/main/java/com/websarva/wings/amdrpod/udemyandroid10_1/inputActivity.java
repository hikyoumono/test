package com.websarva.wings.amdrpod.udemyandroid10_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;

import io.realm.Realm;

public class inputActivity extends AppCompatActivity {

    private Realm mrealm;
    private long mId;
    private TextView date;
    private TextView title;
    private EditText detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        mrealm = Realm.getDefaultInstance();
        date = findViewById(R.id.date);
        title = findViewById(R.id.title_text);
        detail = findViewById(R.id.syousai_text);

        if (getIntent() != null) {
            //get型タイプExtraメソッドによってIntentで呼ばれた遷移先から数値を引き継いでくる。
            mId = getIntent().getLongExtra("id", -1);

            //取り出すだけならトランザクションはいらない
            Scedule s = mrealm.where(Scedule.class).equalTo("id", mId).findFirst();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            String format = sdf.format(s.date);
            date.setText(format);
            title.setText(s.title);
            detail.setText(s.detail);
        }
        title.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(final Editable s) {
                mrealm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        Scedule scedule = realm.where(Scedule.class).equalTo("id", mId).findFirst();
                        scedule.title = s.toString(); //この一文で更新完了
                    }
                });
            }
        });
        detail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(final Editable s) {
                mrealm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        Scedule scedule = realm.where(Scedule.class).equalTo("id", mId).findFirst();
                        scedule.detail=s.toString();
                    }
                });
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mrealm.close();
    }
}
