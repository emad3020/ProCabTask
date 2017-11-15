package com.askerlap.emad.logintaskprocab.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatEditText;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

import com.askerlap.emad.logintaskprocab.Adapter.SpinnerDataAdapter;
import com.askerlap.emad.logintaskprocab.R;

/**
 * Created by emad on 11/15/17.
 */

public class FirstFragment extends Fragment {
    private AppCompatEditText mEdFirstname;
    private AppCompatEditText mEdLastname;
    private AppCompatEditText mEdUserMail;
    private AppCompatEditText mEdUserPhone;
    private AppCompatEditText mEdUserAddress;
    private Spinner mSpMaritalStatus;
    private Spinner mSpNationality;
    private AppCompatEditText mEdEmployeerName;
    private AppCompatEditText mEdEngagementData;

    private SpinnerDataAdapter mAdapter ;
    private String[] MaritalStatus;
    private String[] mNationalities;
    //------------ get an instance of this fragment -----------//
    public static Fragment newInstance(Context context){
        FirstFragment secondFragment = new FirstFragment();
        return secondFragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        //----------- inflating the layout view of the fragment -------//
        int LayoutToInflate = R.layout.first_fragment_layout;
        boolean shouldAttachToParentImmediately = false;
        View fragmentView = inflater.inflate(LayoutToInflate,container,shouldAttachToParentImmediately);


        /********************* UI COMPONENTS ******************************/
        mEdFirstname = fragmentView.findViewById(R.id.ed_firstname);
        mEdLastname = fragmentView.findViewById(R.id.ed_lastname);
        mEdUserMail = fragmentView.findViewById(R.id.ed_userMail);
        mEdUserPhone = fragmentView.findViewById(R.id.ed_userPhone);
        mEdUserAddress = fragmentView.findViewById(R.id.ed_userAddress);
        mSpMaritalStatus = fragmentView.findViewById(R.id.sp_marital_status);
        mSpNationality = fragmentView.findViewById(R.id.sp_nationality);
        mEdEmployeerName = fragmentView.findViewById(R.id.ed_employeerName);
        mEdEngagementData = fragmentView.findViewById(R.id.ed_engagementData);
        /********************* END OF UI COMPONENTS ******************************/

        //--------------- initialize the spinner of marital status with mock data ------//
        MaritalStatus = getResources().getStringArray(R.array.marital_status);
        mAdapter = new SpinnerDataAdapter(getActivity(),MaritalStatus);
        mSpMaritalStatus.setAdapter(mAdapter);


        //--------------- initialize the spinner of Nationality with mock data ------//
        mNationalities = getResources().getStringArray(R.array.nationalities_array);
        mAdapter = new SpinnerDataAdapter(getActivity(),mNationalities);
        mSpNationality.setAdapter(mAdapter);


        return fragmentView;
    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        getActivity().getMenuInflater().inflate(R.menu.register_menu,menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int selectedItemID = item.getItemId();

        return super.onOptionsItemSelected(item);
    }

}
