package com.example.marta.myapplication.model;

/**
 * Created by Marta on 01/04/2015.
 */
public class AppModelLol {

    private static int clicksCountLol = 0;

    public static void handleClick() {
        clicksCountLol++;
    }

    public static int getClicks() {
        return clicksCountLol;
    }
}
