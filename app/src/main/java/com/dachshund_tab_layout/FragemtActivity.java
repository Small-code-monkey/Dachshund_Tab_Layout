package com.dachshund_tab_layout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class FragemtActivity extends Fragment {

    View view;

    @Bind(R.id.textview)
    TextView textview;

    final static String pagertext = "";
    String textString;

    public static FragemtActivity newInstance(String text) {
        FragemtActivity fragment = new FragemtActivity();
        Bundle args = new Bundle();
        args.putString(pagertext, text);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        textString = getArguments().getString(pagertext);
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_fragemt, container, false);
        ButterKnife.bind(this, view);
        textview.setText(textString);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}