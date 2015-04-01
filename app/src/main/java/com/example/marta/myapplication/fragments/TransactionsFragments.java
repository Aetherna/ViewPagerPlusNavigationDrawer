package com.example.marta.myapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.marta.myapplication.R;
import com.example.marta.myapplication.model.AppModelLol;

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

        return viewGroup;
    }

    @Override
    public void update() {
        if (transactionsCountTV != null) {
            transactionsCountTV.setText(lolTransactions + AppModelLol.getClicks());
        }
    }
}
