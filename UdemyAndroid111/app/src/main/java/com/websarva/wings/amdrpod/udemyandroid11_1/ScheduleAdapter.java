package com.websarva.wings.amdrpod.udemyandroid11_1;

import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;

import io.realm.OrderedRealmCollection;
import io.realm.RealmBaseAdapter;

public class ScheduleAdapter extends RealmBaseAdapter<Schedule> {
    private int[] image ={R.drawable.image0,R.drawable.image1,R.drawable.image2};

    public ScheduleAdapter(@Nullable OrderedRealmCollection<Schedule> data) {
        super(data);
    }

    private static class ViewHolder {
        ImageView card;
        TextView date;
        TextView title;
        TextView detail;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).//①Toast作成
                    inflate(R.layout.custom_cell, parent, false);//どんなToastか指定
            viewHolder = new ViewHolder();//View作成
            viewHolder.card =(ImageView)convertView.findViewById(R.id.cardImage);
            viewHolder.date = (TextView) convertView.findViewById(R.id.date);//View一個目
            viewHolder.title = (TextView) convertView.findViewById(R.id.title);//View2個目
            viewHolder.detail =(TextView) convertView.findViewById(R.id.detail);
            convertView.setTag(viewHolder);//作ったViewを①に代入
        } else {
            viewHolder = (ViewHolder) convertView.getTag(); //二つ目以降
        }
        Schedule sc = adapterData.get(position); //取り出したデータベース順に位置を決めていく
        SimpleDateFormat sim = new SimpleDateFormat("yyyy/MM/dd");
        String format = sim.format(sc.date);
        viewHolder.date.setText(format);
        viewHolder.title.setText(sc.title);
        viewHolder.card.setImageResource(image[(int)sc.id % 3]);
        viewHolder.detail.setText(sc.detail);

        return convertView;
}
}
