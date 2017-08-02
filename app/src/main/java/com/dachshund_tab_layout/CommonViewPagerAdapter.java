package com.dachshund_tab_layout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Date：2017/8/2
 * Function:适配器
 */

public class CommonViewPagerAdapter extends FragmentPagerAdapter {
    List<Fragment> mFragments = new ArrayList<>();
    String[] titleStrings;

    public CommonViewPagerAdapter(FragmentManager fm, String[] titleStrings) {
        super(fm);
        this.titleStrings = titleStrings;
    }

    public void addFragment(Fragment fragment) {
        mFragments.add(fragment);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleStrings[position];
    }
}
