package com.websarva.wings.amdrpod.udemyandroid10_3;

import android.app.Application;

import io.realm.Realm;

public class RealmSetup extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
