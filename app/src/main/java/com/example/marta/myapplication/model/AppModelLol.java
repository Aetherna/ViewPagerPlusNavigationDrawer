package com.example.marta.myapplication.model;

import android.content.Context;

import com.example.marta.myapplication.LolApplication;
import com.example.marta.myapplication.otto.AppModelLolUpdated;

/**
 * Created by Marta on 01/04/2015.
 */
public class AppModelLol {

    private Context context;

    public AppModelLol(final Context context) {
        this.context = context;
    }

    private int clicksCountLol = 0;

    public void handleClick() {
        clicksCountLol++;
        ((LolApplication)context.getApplicationContext()).getScreensMonitor().post(new AppModelLolUpdated());
    }

    public int getClicks() {
        return clicksCountLol;
    }
}
