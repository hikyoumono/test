package com.websarva.wings.amdrpod.udemyandroid11_1;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Schedule extends RealmObject {
    @PrimaryKey
    public long id;
    public Date date;
    public String title;
    public String detail;
}