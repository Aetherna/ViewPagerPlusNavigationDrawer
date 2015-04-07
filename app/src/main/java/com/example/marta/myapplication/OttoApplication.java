package com.example.marta.myapplication;

import android.app.Application;

import com.example.marta.myapplication.model.TransactionsData;
import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

/**
 * Created by Marta on 01/04/2015.
 */
public class OttoApplication extends Application {

    private static final Bus screensMonitor = new Bus(ThreadEnforcer.MAIN);
    private TransactionsData appModelLol;

    @Override
    public void onCreate() {
        super.onCreate();
        appModelLol = new TransactionsData(this);
    }

    public static Bus getScreensMonitor() {
        return screensMonitor;
    }

    public TransactionsData getTransactionsModel() {
        return appModelLol;
    }
}
