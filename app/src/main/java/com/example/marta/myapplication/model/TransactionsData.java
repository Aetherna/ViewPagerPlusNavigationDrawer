package com.example.marta.myapplication.model;

import android.content.Context;

import com.example.marta.myapplication.OttoApplication;
import com.example.marta.myapplication.otto.TransactionsDataUpdated;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Marta on 01/04/2015.
 */
public class TransactionsData {

    private Context context;
    private Map<ETransactionType, Integer> data;

    public TransactionsData(final Context context) {
        this.context = context;
        this.data = new HashMap<>();
    }


    public void handleClick(ETransactionType type) {
        Integer transactionData = data.get(type);
        if(transactionData == null){
            data.put(type, Integer.valueOf(1));
        }else{
            data.remove(type);
            data.put(type, transactionData + 1);
        }
        ((OttoApplication) context.getApplicationContext()).getScreensMonitor().post(new TransactionsDataUpdated());
    }

    public Map<ETransactionType, Integer> getClicks() {
        return data;
    }
}
