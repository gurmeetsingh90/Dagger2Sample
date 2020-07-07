package com.anushka.androidtutz.di;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationContextModule {

    private final Application application;

    public ApplicationContextModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Application provideApplication() {
      return application;
    }

}
