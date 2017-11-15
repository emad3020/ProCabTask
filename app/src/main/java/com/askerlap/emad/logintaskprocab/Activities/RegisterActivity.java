package com.askerlap.emad.logintaskprocab.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.askerlap.emad.logintaskprocab.Adapter.viewerPagerAdapter;
import com.askerlap.emad.logintaskprocab.R;
import com.askerlap.emad.logintaskprocab.Utilities.PermissionUtility;
import com.askerlap.emad.logintaskprocab.View.LockedViewPager;

import me.relex.circleindicator.CircleIndicator;

public class RegisterActivity extends AppCompatActivity {

    public static LockedViewPager mFragmentPager;
    private CircleIndicator mViewPagerIndicator;
    private PermissionUtility permissionUtility;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        /********************* UI COMPONENTS ******************************/

        mFragmentPager = findViewById(R.id.fragmentPager);
        mViewPagerIndicator = findViewById(R.id.viewPagerIndicator);
        mFragmentPager.setSwipeable(false);   //prevent pager from swiping

        /********************* END OF UI COMPONENTS ***********************/

        mFragmentPager.setAdapter(new viewerPagerAdapter(getSupportFragmentManager(),this));
        mViewPagerIndicator.setViewPager(mFragmentPager);

        permissionUtility = new PermissionUtility(RegisterActivity.this);

        permissionUtility.checkMultiplePermissionSC();

    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.register_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int selectedItemId = item.getItemId();
        if (selectedItemId == R.id.action_next){

            mFragmentPager.setCurrentItem(1,true);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/


}
