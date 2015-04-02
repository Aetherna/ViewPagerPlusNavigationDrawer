package com.example.marta.myapplication;

import android.app.Application;

import com.example.marta.myapplication.model.AppModelLol;
import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

/**
 * Created by Marta on 01/04/2015.
 */
public class LolApplication extends Application {

    private static final Bus screensMonitor = new Bus(ThreadEnforcer.MAIN);
    private AppModelLol appModelLol;

    @Override
    public void onCreate() {
        super.onCreate();
        appModelLol = new AppModelLol(this);
    }

    public static Bus getScreensMonitor() {
        return screensMonitor;
    }

    public AppModelLol getAppModelLol() {
        return appModelLol;
    }
}
