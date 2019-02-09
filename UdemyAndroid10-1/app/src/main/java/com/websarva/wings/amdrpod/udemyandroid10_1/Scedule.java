package com.websarva.wings.amdrpod.udemyandroid10_1;

import java.util.Date;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Owner on 2019/01/09.
 */

public class Scedule extends RealmObject {
    //フィールド
    @PrimaryKey
    public long id;
    public  Date date;
    public  String title;
    public  String detail;

}
