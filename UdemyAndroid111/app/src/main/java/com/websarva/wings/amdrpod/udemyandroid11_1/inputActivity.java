package com.websarva.wings.amdrpod.udemyandroid11_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;

import io.realm.Realm;

public class inputActivity extends AppCompatActivity {
    private Realm mr;
    private long mId;
    private TextView mDate;
    private EditText mTitle;
    private EditText mDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        mr = Realm.getDefaultInstance();
        mDate = (TextView) findViewById(R.id.day);
        mTitle = (EditText) findViewById(R.id.title);
        mDetail = (EditText) findViewById(R.id.detail);

        if (getIntent() != null) {
            mId = getIntent().getLongExtra("id", -1);

            Schedule sc = mr.where(Schedule.class).equalTo("id", mId).findFirst();
            SimpleDateFormat sim = new SimpleDateFormat("yyyy/MM/dd");
            String format = sim.format(sc.date);
            mDate.setText(format);
            mTitle.setText(sc.title);
            mDetail.setText(sc.detail);
        }
        mTitle.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(final Editable s) {
                mr.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        Schedule sc = realm.where(Schedule.class).equalTo("id", mId).findFirst();
                        sc.title = s.toString();
                    }
                });
            }
        });
        mDetail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(final Editable s) {
                mr.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        Schedule sc = mr.where(Schedule.class).equalTo("id", mId).findFirst();
                        sc.detail = s.toString();
                    }
                });
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mr.close();
    }
}
