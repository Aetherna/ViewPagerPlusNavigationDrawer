package com.example.marta.myapplication.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.marta.myapplication.MainActivity2;
import com.example.marta.myapplication.R;

/**
 * Created by Marta on 01/04/2015.
 */
public class Data1Fragment extends Fragment{

    private Button click;

    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);

        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.data1_fragment,container, false);

        click= (Button) viewGroup.findViewById(R.id.button);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                Intent intent = new Intent(Data1Fragment.this.getActivity(), MainActivity2.class);
                startActivity(intent);
            }
        });

        return viewGroup;
    }
}
