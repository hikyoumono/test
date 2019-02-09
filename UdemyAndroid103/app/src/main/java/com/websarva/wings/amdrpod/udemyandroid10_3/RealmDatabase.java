package com.websarva.wings.amdrpod.udemyandroid10_3;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class RealmDatabase extends RealmObject {

    @PrimaryKey
    public long id;
    public Date date;
    public String title;
    public String detail;
}