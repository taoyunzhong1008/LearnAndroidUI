package com.ted.learnandroidui.activity;

import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.ted.learnandroidui.R;
import com.ted.learnandroidui.fragment.BaseViewFragment;
import com.ted.learnandroidui.fragment.CustomViewFragment;
import com.ted.learnandroidui.fragment.MaterialDesignFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.drawer)
    DrawerLayout mDrawer;

    @BindView(R.id.nav_view)
    NavigationView mNavView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        mNavView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, getFragmentById(item.getItemId())).commit();
                mDrawer.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }

    private Fragment getFragmentById(int id) {
        Fragment fragment = null;
        switch (id) {
            case R.id.base_view:
                fragment = new BaseViewFragment();
                break;
            case R.id.custom_view:
                fragment = new CustomViewFragment();
                break;
            case R.id.material_design_view:
                fragment = new MaterialDesignFragment();
                break;
        }
        return fragment;
    }


}
