package com.askerlap.emad.logintaskprocab.Activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.askerlap.emad.logintaskprocab.Adapter.viewerPagerAdapter;
import com.askerlap.emad.logintaskprocab.R;

import me.relex.circleindicator.CircleIndicator;

public class RegisterActivity extends AppCompatActivity {

    private ViewPager mFragmentPager;
    private CircleIndicator mViewPagerIndicator;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        /********************* UI COMPONENTS ******************************/

        mFragmentPager = findViewById(R.id.fragmentPager);
        mViewPagerIndicator = findViewById(R.id.viewPagerIndicator);


        /********************* END OF UI COMPONENTS ***********************/

        mFragmentPager.setAdapter(new viewerPagerAdapter(getSupportFragmentManager(),this));
        mViewPagerIndicator.setViewPager(mFragmentPager); }


}
