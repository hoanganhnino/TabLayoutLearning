package com.example.hoanganh.tablayoutlearning;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hoanganh.tablayoutlearning.Fragment.FragmentA;
import com.example.hoanganh.tablayoutlearning.Fragment.FragmentB;
import com.example.hoanganh.tablayoutlearning.Fragment.FragmentC;

import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager = (ViewPager) findViewById(R.id.view_pager);

        setUpPager();
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setUpPager()
    {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new FragmentA(),getResources().getString(R.string.tab_layout_A_name));
        viewPagerAdapter.addFragment(new FragmentB(),getResources().getString(R.string.tab_layout_B_name));
        viewPagerAdapter.addFragment(new FragmentC(),getResources().getString(R.string.tab_layout_C_name));
        viewPager.setAdapter(viewPagerAdapter);
    }
}
