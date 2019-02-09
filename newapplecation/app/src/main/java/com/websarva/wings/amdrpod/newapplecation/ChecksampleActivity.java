package com.websarva.wings.amdrpod.newapplecation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ChecksampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checksample);

        ListView lvMenu = findViewById(R.id.lvMenu);
        lvMenu.setOnItemClickListener(new CheckListnear());
    }

    private class CheckListnear implements AdapterView.OnItemClickListener {
        public void onItemClick(AdapterView<?> parent, View view,int position,long id){
            String item = (String)parent.getItemAtPosition(position);
            String show ="あなたが選んだ定食:" + item;
            Toast.makeText(ChecksampleActivity.this,show, Toast.LENGTH_LONG).show();
        }
    }
}