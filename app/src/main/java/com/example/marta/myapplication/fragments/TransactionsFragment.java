package com.example.marta.myapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.marta.myapplication.OttoApplication;
import com.example.marta.myapplication.R;
import com.example.marta.myapplication.model.ETransactionType;
import com.example.marta.myapplication.otto.TransactionsDataUpdated;
import com.squareup.otto.Subscribe;

import java.util.Map;

/**
 * Created by Marta on 01/04/2015.
 */
public class TransactionsFragment extends Fragment implements IUpdatedFragment {

    private final String lolTransactions = "Transactions ";
    private TextView transactionsCountTV;

    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);

        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.transactions_fragment, container, false);
        transactionsCountTV = (TextView) viewGroup.findViewById(R.id.transactions_count);
        update();
        //register to Otto
        ((OttoApplication) getActivity().getApplication()).getScreensMonitor().register(this);

        return viewGroup;
    }

    //handle event
    @Subscribe
    public void handleAppModelLolUpdatedEvent(TransactionsDataUpdated event) {
        update();
    }


    @Override
    public void update() {
        Map<ETransactionType, Integer> data = ((OttoApplication) getActivity()
                .getApplication()).getTransactionsModel()
                .getClicks();
        StringBuilder sb = new StringBuilder("Transactions count: " + "\n");

        for(ETransactionType type: data.keySet()){
            sb.append(type).append(" ").append(data.get(type)).append("\n");
        }

        if (transactionsCountTV != null) {
            transactionsCountTV.setText(sb.toString());
        }

    }
}
