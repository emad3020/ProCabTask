package com.askerlap.emad.logintaskprocab.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Toast;

import com.askerlap.emad.logintaskprocab.R;
import com.askerlap.emad.logintaskprocab.Utilities.ValidationChecker;

public class LoginActivity extends AppCompatActivity {

    private AppCompatEditText mEdEmailInput;
    private AppCompatEditText mEdPasswordInput;
    private AppCompatButton mBtnLogin;
    private AppCompatButton mBtnForgetPassword;
    private AppCompatButton mBtnHaveNoAccount;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //--------------- Hide the ActionBar for full view Screen --------//
        assert getSupportActionBar() != null;
        getSupportActionBar().hide();

        /****************** UI COMPONENTS *************************/
        mEdEmailInput = findViewById(R.id.ed_email_input);
        mEdPasswordInput = findViewById(R.id.ed_password_input);
        mBtnLogin = findViewById(R.id.btn_login);
        mBtnForgetPassword = findViewById(R.id.btn_forget_password);
        mBtnHaveNoAccount = findViewById(R.id.btn_have_no_account);
        /****************** END OF UI COMPONENTS ******************/

        mBtnLogin.setOnClickListener(onLoginClicked());

        mBtnForgetPassword.setOnClickListener(onLoginClicked());  //use the same listener of login button to show the toast

        mBtnHaveNoAccount.setOnClickListener(onRegisterClicked());

    }


                            //----------- listener for the login button --------//
    /******************************************************************************************************************
     *
     * the code below do no thing just showing a toast as a small message for knowing the user that the
     * button is working , as soon as the full data of the web service is ready the right code of authentication will work
     * *************************************************************************************************************/
    private View.OnClickListener onLoginClicked() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userMail = mEdEmailInput.getText().toString();
                String userPassword = mEdPasswordInput.getText().toString();
                if (ValidationChecker.EmailValidation.isEmpty(userMail)){
                    mEdEmailInput.setError(getString(R.string.invalid_empty_input_error));
                } else if (!ValidationChecker.EmailValidation.isGoodEmail(userMail)){
                    mEdEmailInput.setError(getString(R.string.invalid_bad_email));
                } else if (ValidationChecker.PasswordValidation.isEmpty(userPassword)){
                    mEdPasswordInput.setError(getString(R.string.invalid_empty_input_error));
                } else if (!ValidationChecker.PasswordValidation.isStrongPassword(userPassword)){
                    mEdPasswordInput.setError(getString(R.string.invalid_weak_password));
                } else {
                    startMainActivity();
                }

            }
        };
    }





    //-------------- listener to link the Registration activity ----------//
    private View.OnClickListener onRegisterClicked(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context =LoginActivity.this ;

                Class destinationClass = RegisterActivity.class;


                Intent registerIntent = new Intent(context,destinationClass);

                startActivity(registerIntent);
            }
        };
    }


    private void startMainActivity(){
        Context context = LoginActivity.this;
        String sms = " Button just clicked";
        int duration = Toast.LENGTH_LONG;

        Toast.makeText(context, sms, duration)
                .show();
    }
}
