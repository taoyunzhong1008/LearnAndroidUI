package com.ted.learnandroidui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ted.learnandroidui.R;
import com.ted.learnandroidui.base.BaseFragment;

/**
 * FileName:
 * com.ted.learnandroidui.fragment.CustomViewFragment.java
 * Author: TT
 * Date: 2017-03-09
 * Description: <描述当前版本功能>
 */
public class CustomViewFragment extends BaseFragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_custom_view, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
