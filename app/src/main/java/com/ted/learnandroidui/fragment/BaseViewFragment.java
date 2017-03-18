package com.ted.learnandroidui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.ted.learnandroidui.R;
import com.ted.learnandroidui.base.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * FileName:
 * com.ted.learnandroidui.fragment.BaseViewFragment.java
 * Author: TT
 * Date: 2017-03-09
 * Description: <描述当前版本功能>
 */
public class BaseViewFragment extends BaseFragment{

    // TODO TextView
    // TODO EditText
    // TODO Button
    // TODO ImageButton
    // TODO RadioButton, RadioGroup
    // TODO CheckBox
    // TODO ImageView
    // TODO ProgressBar
    // TODO ToggleButton
    // TODO RatingButton
    // TODO ListView
    // TODO GridView

    @BindView(R.id.lv_views)
    ListView mLvViews;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_base_view, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
