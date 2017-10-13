package com.example.vibrant1.slidepanedemo;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kyleduo.switchbutton.SwitchButton;


public class mainFrag extends Fragment {




    public mainFrag() {
        // Required empty public constructor
    }

    TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        tv = v.findViewById(R.id.textview);

        return v;

    }

    public void setBookmark(String bookmark) {
        tv.setText(bookmark);
    }
}
