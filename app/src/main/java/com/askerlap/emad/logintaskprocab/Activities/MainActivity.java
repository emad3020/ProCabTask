package com.askerlap.emad.logintaskprocab.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import com.askerlap.emad.logintaskprocab.R;

public class MainActivity extends AppCompatActivity {
    private AppCompatButton mBtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnLogin = findViewById(R.id.btn_login);
        mBtnLogin.setOnClickListener(showLoginScreen);

    }




    private View.OnClickListener showLoginScreen = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Context context = MainActivity.this;

            Class destinationClass = LoginActivity.class;

            Intent intentForLoginClass = new Intent(context,destinationClass);

            intentForLoginClass.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|
                    Intent.FLAG_ACTIVITY_CLEAR_TASK|
                    Intent.FLAG_ACTIVITY_CLEAR_TOP);

            startActivity(intentForLoginClass);
        }
    };
}
