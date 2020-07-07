package com.anushka.androidtutz.di;

import com.anushka.androidtutz.contactmanager.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationContextModule.class, ContactModule.class})
public interface ContactAppComponent {

  void inject(MainActivity mainActivity);

}
