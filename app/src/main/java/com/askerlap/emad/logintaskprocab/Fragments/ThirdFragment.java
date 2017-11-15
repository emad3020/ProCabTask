package com.askerlap.emad.logintaskprocab.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.askerlap.emad.logintaskprocab.R;
import com.askerlap.emad.logintaskprocab.Utilities.ValidationChecker;

/**
 * Created by emad on 11/15/17.
 */

public class ThirdFragment extends Fragment {

    private AppCompatEditText mEdPassword;
    private AppCompatEditText mEdConfirmPassword;
    private AppCompatButton mBtnFinish;
    //------------ get an instance of this fragment -----------//
    public static Fragment newInstance(Context context){
       ThirdFragment thirdFragment = new ThirdFragment();
        return thirdFragment;
    }

    //------------- inflating the layout to the fragment --------//

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        int LayoutToInflate = R.layout.third_fragment_layout;
        boolean shouldAttachToParentImmediately = false;
        View fragmentView = inflater.inflate(LayoutToInflate,container,shouldAttachToParentImmediately);
        /********************************* UI COMPONENTS ***************************/
        mEdPassword = fragmentView.findViewById(R.id.ed_password);
        mEdConfirmPassword = fragmentView.findViewById(R.id.ed_confirmPassword);
        mBtnFinish = fragmentView.findViewById(R.id.btn_finish);
        /********************************* END OF UI COMPONENTS ********************/

        mBtnFinish.setOnClickListener(onFinishClicked());
        return fragmentView;
    }



    //----------- listener for the finish button clicked --------//
    private View.OnClickListener onFinishClicked(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = mEdPassword.getText().toString();
                String confirmPass = mEdConfirmPassword.getText().toString();
                if (ValidationChecker.isEmpty(password)){
                    mEdPassword.setError(getString(R.string.invalid_empty_input_error));
                } else if (!ValidationChecker.PasswordValidation.isStrongPassword(password)){
                    mEdPassword.setError(getString(R.string.invalid_weak_password));
                } else if (ValidationChecker.isEmpty(confirmPass)){
                    mEdConfirmPassword.setError(getString(R.string.invalid_empty_input_error));
                } else if (!ValidationChecker.PasswordValidation.isSimilarPassword(password,confirmPass)){
                    mEdConfirmPassword.setError(getString(R.string.invalid_not_similar_error));
                } else {
                   startMainActivity();
                }

            }
        };
    }


    private void startMainActivity(){
        Context context = getActivity();
        String mesg = "All data completed successfully";
        Toast.makeText(context,mesg,Toast.LENGTH_LONG)
                .show();
    }
}
