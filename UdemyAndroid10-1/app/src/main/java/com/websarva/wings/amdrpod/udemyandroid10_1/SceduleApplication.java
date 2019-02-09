package com.websarva.wings.amdrpod.udemyandroid10_1;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by Owner on 2019/01/09.
 */

public class SceduleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
