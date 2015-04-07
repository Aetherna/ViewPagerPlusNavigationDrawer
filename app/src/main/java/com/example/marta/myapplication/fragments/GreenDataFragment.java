package com.example.marta.myapplication.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.marta.myapplication.OttoApplication;
import com.example.marta.myapplication.R;
import com.example.marta.myapplication.activity.PinkActivity;
import com.example.marta.myapplication.model.ETransactionType;

/**
 * Created by Marta on 01/04/2015.
 */
public class GreenDataFragment extends Fragment {
    private Button click;

    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);

        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.green_fragment, container, false);
        click = (Button) viewGroup.findViewById(R.id.button);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                ((OttoApplication) getActivity().getApplication()).getTransactionsModel()
                        .handleClick(ETransactionType.GREEN);
            }
        });
        return viewGroup;
    }
}
