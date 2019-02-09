package com.websarva.wings.amdrpod.udemyandroid10_3;

import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;

import io.realm.OrderedRealmCollection;
import io.realm.RealmBaseAdapter;

public class RealmAdapter extends RealmBaseAdapter {

    private static class ViewHolder {
        TextView date;
        TextView title;
    }

    public RealmAdapter(@Nullable OrderedRealmCollection data) {
        super(data);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            //inflateメソッドはviewを作成する
            convertView = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_2, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.date = (TextView) convertView.findViewById(R.id.text);
            viewHolder.title = (TextView) convertView.findViewById(R.id.text2);
            convertView.setTag(viewHolder); //Tagはトーストのこと
            /*一番上のトーストがスクロールで場外に出た場合、positionを下からスクロールされて上がってくる
             *新しいのに、渡して再利用する。
             *
             */

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        RealmDatabase schedule = (RealmDatabase) adapterData.get(position);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String formatDate = sdf.format(schedule.date);
        viewHolder.date.setText(formatDate);
        viewHolder.title.setText(schedule.title);
        return convertView;
    }
}
