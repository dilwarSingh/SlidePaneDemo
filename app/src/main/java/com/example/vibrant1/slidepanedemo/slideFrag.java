package com.example.vibrant1.slidepanedemo;


import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
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

    TextView profileCount, bookingCount, friendsCount,
            travelsCount, messagesCount, paymentsCount,
            chatsCount, invoiceCount, inviteCount,
            walletCount, updateCount, ratingCount;
    ImageView bottomScoobarIcon;

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
        profileImage = v.findViewById(R.id.profile_image);
        bottomScoobarIcon = v.findViewById(R.id.scoobarBottomIcon);

        messageText = v.findViewById(R.id.messageText);
        paymentText = v.findViewById(R.id.PaymentText);

        inviteCount = v.findViewById(R.id.invitesCount);
        walletCount = v.findViewById(R.id.walletCount);
        ratingCount = v.findViewById(R.id.ratingsCount);
        profileCount = v.findViewById(R.id.profileCount);
        chatsCount = v.findViewById(R.id.chatCount);
        invoiceCount = v.findViewById(R.id.invoiceCount);
        profileCount = v.findViewById(R.id.profileCount);
        paymentsCount = v.findViewById(R.id.PaymentCount);
        friendsCount = v.findViewById(R.id.friendCount);
        travelsCount = v.findViewById(R.id.travelCount);

        messagesCount = v.findViewById(R.id.messageCount);
        updateCount = v.findViewById(R.id.updateCount);
        bookingCount = v.findViewById(R.id.bookingCount);

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
                    blackTheme();

                } else {
                    orangeTheme();
                }
            }
        });

        setHasOptionsMenu(true);
        return v;
    }

    private void orangeTheme() {
        midFrameA.setVisibility(View.VISIBLE);
        midFrameB.setVisibility(View.GONE);
        bottomContainer.setBackground(getResources().getDrawable(R.drawable.orange_grad_right));
        profileImage.setBorderColor(getResources().getColor(R.color.colorOrange));
        bottomScoobarIcon.setImageDrawable(getResources().getDrawable(R.drawable.blue_scoobar));

        setBlankCloud(R.drawable.orange_blank_cloud, R.color.colorOrange);
        setFilledCloud(R.drawable.orange_filled_cloud, android.R.color.white);

    }

    private void blackTheme() {
        midFrameA.setVisibility(View.GONE);
        midFrameB.setVisibility(View.VISIBLE);
        bottomContainer.setBackground(getResources().getDrawable(R.drawable.black_grad_right));
        profileImage.setBorderColor(getResources().getColor(android.R.color.black));
        bottomScoobarIcon.setImageDrawable(getResources().getDrawable(R.drawable.black_scoobar));

        setBlankCloud(R.drawable.black_empty_cloud, R.color.colorBlack);
        setFilledCloud(R.drawable.black_filled_cloud, android.R.color.white);
    }

    private void setFilledCloud(int orange_filled_cloud, int color) {
        messagesCount.setBackground(getResources().getDrawable(orange_filled_cloud));
        updateCount.setBackground(getResources().getDrawable(orange_filled_cloud));
        bookingCount.setBackground(getResources().getDrawable(orange_filled_cloud));

        messagesCount.setTextColor(getResources().getColor(color));
        updateCount.setTextColor(getResources().getColor(color));
        bookingCount.setTextColor(getResources().getColor(color));
    }

    private void setBlankCloud(int orange_blank_cloud, int color) {
        inviteCount.setBackground(getResources().getDrawable(orange_blank_cloud));
        walletCount.setBackground(getResources().getDrawable(orange_blank_cloud));
        ratingCount.setBackground(getResources().getDrawable(orange_blank_cloud));
        profileCount.setBackground(getResources().getDrawable(orange_blank_cloud));
        chatsCount.setBackground(getResources().getDrawable(orange_blank_cloud));
        invoiceCount.setBackground(getResources().getDrawable(orange_blank_cloud));
        profileCount.setBackground(getResources().getDrawable(orange_blank_cloud));
        paymentsCount.setBackground(getResources().getDrawable(orange_blank_cloud));
        friendsCount.setBackground(getResources().getDrawable(orange_blank_cloud));
        travelsCount.setBackground(getResources().getDrawable(orange_blank_cloud));


        inviteCount.setTextColor(getResources().getColor(color));
        walletCount.setTextColor(getResources().getColor(color));
        ratingCount.setTextColor(getResources().getColor(color));
        profileCount.setTextColor(getResources().getColor(color));
        chatsCount.setTextColor(getResources().getColor(color));
        invoiceCount.setTextColor(getResources().getColor(color));
        profileCount.setTextColor(getResources().getColor(color));
        paymentsCount.setTextColor(getResources().getColor(color));
        friendsCount.setTextColor(getResources().getColor(color));
        travelsCount.setTextColor(getResources().getColor(color));
    }


}
