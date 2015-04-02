package com.example.marta.myapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.marta.myapplication.LolApplication;
import com.example.marta.myapplication.R;
import com.example.marta.myapplication.otto.AppModelLolUpdated;
import com.squareup.otto.Subscribe;

/**
 * Created by Marta on 01/04/2015.
 */
public class TransactionsFragments extends Fragment implements ILolFragment {

    private final String lolTransactions = "Transactions ";
    private TextView transactionsCountTV;

    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);

        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.transactions_fragment, container, false);
        transactionsCountTV = (TextView) viewGroup.findViewById(R.id.transactions_count);

        //register to Otto
        ((LolApplication) getActivity().getApplication()).getScreensMonitor().register(this);


        return viewGroup;
    }

    //handle event
    @Subscribe
    public void handleAppModelLolUpdatedEvent(AppModelLolUpdated event) {
        update();
    }

    @Override
    public void update() {
        if (transactionsCountTV != null) {
            transactionsCountTV.setText(lolTransactions + ((LolApplication) getActivity()
                    .getApplication()).getAppModelLol()
                    .getClicks());
        }
    }
}
