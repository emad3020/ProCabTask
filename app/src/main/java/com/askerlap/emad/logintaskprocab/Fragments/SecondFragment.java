package com.askerlap.emad.logintaskprocab.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.askerlap.emad.logintaskprocab.R;

/**
 * Created by emad on 11/15/17.
 */

public class  SecondFragment extends Fragment {



    //------------ get an instance of this fragment -----------//
    public static Fragment newInstance(Context context){
        SecondFragment secondFragment = new SecondFragment();
        return secondFragment;
    }

    //------------- inflating the layout to the fragment --------//

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        int LayoutToInflate = R.layout.second_fragment_layout;
        boolean shouldAttachToParentImmediately = false;
        View fragmentView = inflater.inflate(LayoutToInflate,container,shouldAttachToParentImmediately);
        return fragmentView;
    }
}
