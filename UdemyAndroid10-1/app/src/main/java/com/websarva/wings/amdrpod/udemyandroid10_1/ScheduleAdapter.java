package com.websarva.wings.amdrpod.udemyandroid10_1;

import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;

import io.realm.OrderedRealmCollection;
import io.realm.RealmBaseAdapter;

public class ScheduleAdapter extends RealmBaseAdapter<Scedule> {
    public ScheduleAdapter(@Nullable OrderedRealmCollection data) {
        super(data);
    }

    private static class ViewHolder {
        //これがリストに表示される
        TextView date;
        TextView title;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_2, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.date = (TextView) convertView.findViewById(android.R.id.text1);
            viewHolder.title = (TextView) convertView.findViewById(android.R.id.text2);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Scedule sc = adapterData.get(position); //MainActivityでデータベースから引っ張ってきたものを格納
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String format = sdf.format(sc.date);
        viewHolder.date.setText(format);
        viewHolder.title.setText(sc.title);
        return convertView;
    }
}
