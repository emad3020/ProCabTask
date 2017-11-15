package com.askerlap.emad.logintaskprocab.Adapter;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.askerlap.emad.logintaskprocab.Fragments.FirstFragment;
import com.askerlap.emad.logintaskprocab.Fragments.SecondFragment;
import com.askerlap.emad.logintaskprocab.Fragments.ThirdFragment;

/**
 * Created by emad on 11/15/17.
 */

public class viewerPagerAdapter extends FragmentPagerAdapter {

    private Context context;
    public static int page_number = 3;

    public viewerPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }


    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new Fragment();
        switch (position) {
            case 0:
                fragment = FirstFragment.newInstance(context);
                break;
            case 1:
                fragment = SecondFragment.newInstance(context);
                break;
            case 2:
                fragment = ThirdFragment.newInstance(context);
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return page_number;
    }
}
