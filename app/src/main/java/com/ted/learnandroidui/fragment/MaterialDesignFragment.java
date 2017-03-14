package com.ted.learnandroidui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ted.learnandroidui.R;
import com.ted.learnandroidui.base.BaseFragment;

/**
 * FileName:
 * com.ted.learnandroidui.fragment.MaterialDesignFragment.java
 * Author: TT
 * Date: 2017-03-09
 * Description: <描述当前版本功能>
 */
public class MaterialDesignFragment extends BaseFragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_material_design, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
