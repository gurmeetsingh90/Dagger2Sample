package com.dev;

import android.app.Application;

import com.dev.androidtutz.di.*;

public class App extends Application {

    private static App app;
    private ContactAppComponent contactAppComponent;

    public ContactAppComponent getContactAppComponent() {
        return contactAppComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        contactAppComponent = DaggerContactAppComponent.builder()
                .applicationContextModule(new ApplicationContextModule(app))
                .build();
    }

    public static App getApp() {
        return app;
    }
}
