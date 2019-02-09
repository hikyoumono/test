package com.websarva.wings.amdrpod.udemyandroid11_1;

import android.app.Application;
import io.realm.Realm;

public class ScheduleBookAplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
