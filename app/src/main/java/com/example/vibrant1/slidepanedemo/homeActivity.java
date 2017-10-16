package com.example.vibrant1.slidepanedemo;

import android.os.Bundle;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class homeActivity extends AppCompatActivity implements BookmarkListener {


    SlidingPaneLayout pane;
    Toolbar toolbar;
    PaneListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        pane = (SlidingPaneLayout) findViewById(R.id.sp);

        listener = new PaneListener(getSupportFragmentManager(), pane);

        pane.setPanelSlideListener(listener);
        pane.setParallaxDistance(200);



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(false);


        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_navigation));

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(homeActivity.this, "nav clicked", Toast.LENGTH_SHORT).show();
                if (pane.isOpen()) {
                    pane.closePane();
                } else {
                    pane.openPane();
                }
            }
        });


    }

    @Override
    public void onChangeBookmark(String bookmark) {
        // We get notified when user clicks on a bookmark in the ListBookmarkFragment
        System.out.println("Bookmark [" + bookmark + "]");
        mainFrag f = (mainFrag) getSupportFragmentManager()
                .findFragmentById(R.id.rightpane);

        f.setBookmark(bookmark);

    }
}
