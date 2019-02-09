package com.websarva.wings.amdrpod.udemyandroid10_2;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by Owner on 2019/01/20.
 */

public class Realm1 extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
