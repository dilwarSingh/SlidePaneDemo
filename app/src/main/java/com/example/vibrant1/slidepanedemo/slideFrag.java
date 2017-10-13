package com.example.vibrant1.slidepanedemo;


import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.kyleduo.switchbutton.SwitchButton;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class slideFrag extends Fragment {


    SwitchButton aSwitch;
    ConstraintLayout midFrameA, midFrameB;
    LinearLayout bottomContainer;
    TextView messageText, paymentText;
    CircleImageView profileImage;

    public slideFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_slide, container, true);

        aSwitch = v.findViewById(R.id.switch1);
        midFrameA = v.findViewById(R.id.midFrameTypeA);
        midFrameB = v.findViewById(R.id.midFrameTypeB);
        bottomContainer = v.findViewById(R.id.bottomContainer);
        messageText = v.findViewById(R.id.messageText);
        paymentText = v.findViewById(R.id.PaymentText);
        profileImage = v.findViewById(R.id.profile_image);

        messageText.setSelected(true);
        paymentText.setSelected(true);


        aSwitch = v.findViewById(R.id.switch1);

        int[][] states = new int[][]{

                new int[]{android.R.attr.state_checked}, // checked
                new int[]{-android.R.attr.state_checked}, // unchecked
        };

        int[] colors = new int[]{
                Color.parseColor("#398DE3"),
                Color.LTGRAY
        };
        ColorStateList list = new ColorStateList(states, colors);

        aSwitch.setBackColor(list);


        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    midFrameA.setVisibility(View.GONE);
                    midFrameB.setVisibility(View.VISIBLE);
                    bottomContainer.setBackground(getResources().getDrawable(R.drawable.black_grad_left));
                    profileImage.setBorderColor(getResources().getColor(android.R.color.black));
                } else {
                    midFrameA.setVisibility(View.VISIBLE);
                    midFrameB.setVisibility(View.GONE);
                    bottomContainer.setBackground(getResources().getDrawable(R.drawable.orange_grad_right));
                    profileImage.setBorderColor(getResources().getColor(R.color.colorOrange));
                }

            }
        });

        setHasOptionsMenu(true);
        return v;
    }

}
