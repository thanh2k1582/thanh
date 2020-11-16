package com.example.tablayout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class DonhangActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mviewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donhang);

        mTabLayout  = findViewById(R.id.tab_layout);
        mviewPager = findViewById(R.id.view_pager);

        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mviewPager.setAdapter(viewPagerAdapter);
        mTabLayout.setupWithViewPager(mviewPager);
    }
}