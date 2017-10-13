package com.example.vibrant1.slidepanedemo;

import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.SlidingPaneLayout;
import android.util.Log;
import android.view.View;

/**
 * Created by Vibrant1 on 12-Oct-17.
 */

public class PaneListener implements SlidingPaneLayout.PanelSlideListener {
    FragmentManager fm;
    SlidingPaneLayout pane;


    public PaneListener(FragmentManager fragmentManager, SlidingPaneLayout pane) {
        fm = fragmentManager;
        this.pane = pane;
    }

    @Override
    public void onPanelClosed(View view) {
        Log.d("testing pane", "Panel closed");

        fm.findFragmentById(R.id.leftpane).setHasOptionsMenu(false);
        fm.findFragmentById(R.id.rightpane).setHasOptionsMenu(true);

    }

    @Override
    public void onPanelOpened(View view) {
        Log.d("testing pane", "Panel opened");

        fm.findFragmentById(R.id.leftpane).setHasOptionsMenu(true);
        fm.findFragmentById(R.id.rightpane).setHasOptionsMenu(false);

    }

    @Override
    public void onPanelSlide(View view, float arg1) {
        Log.d("testing pane", "Panel sliding");
        pane.setSliderFadeColor(Color.TRANSPARENT);
    }

}
