package com.novoda.tpbot.injection;

import android.app.Application;
import android.view.MenuInflater;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    @Provides
    MenuInflater provideMenuInflater(Application application) {
        return new MenuInflater(application.getApplicationContext());
    }

}