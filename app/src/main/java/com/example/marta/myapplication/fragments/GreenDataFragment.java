package com.example.marta.myapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.marta.myapplication.OttoApplication;
import com.example.marta.myapplication.R;
import com.example.marta.myapplication.TabsAdapter;
import com.example.marta.myapplication.model.ETransactionType;
import com.example.marta.myapplication.viewPager.CustomViewPager;

/**
 * Created by Marta on 01/04/2015.
 */
public class GreenDataFragment extends Fragment {
    private Button click;
    private CustomViewPager viewPager;
    private TabsAdapter tabsAdapter;

    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);

        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.green_fragment, container, false);


        viewPager = (CustomViewPager) viewGroup.findViewById(R.id.customviewpager);

        tabsAdapter = new TabsAdapter((ActionBarActivity)getActivity(), viewPager);
        tabsAdapter.addTab(DupaFragment.class, null);
        tabsAdapter.addTab(Dupa2Fragment.class, null);

//        click = (Button) viewGroup.findViewById(R.id.button);
//        click.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(final View view) {
//                ((OttoApplication) getActivity().getApplication()).getTransactionsModel()
//                        .handleClick(ETransactionType.GREEN);
//            }
//        });
        return viewGroup;
    }
}
