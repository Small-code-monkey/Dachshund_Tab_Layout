package com.dachshund_tab_layout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.DachshundTabLayout)
    com.kekstudio.dachshundtablayout.DachshundTabLayout DachshundTabLayout;
    @Bind(R.id.viewager)
    ViewPager viewager;

    CommonViewPagerAdapter adapter;
    FragemtActivity fragemtActivity;
    String[] strings = {"第一页", "第二页", "第三页", "第四页", "第五页"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        adapter = new CommonViewPagerAdapter(getSupportFragmentManager(), strings);

        for (int i = 0; i <= 4; i++) {
            fragemtActivity = new FragemtActivity().newInstance(strings[i]);
            adapter.addFragment(fragemtActivity);
        }

        viewager.setAdapter(adapter);
        DachshundTabLayout.setupWithViewPager(viewager);
        DachshundTabLayout.setTabMode(TabLayout.MODE_FIXED);//排序样式
    }
}