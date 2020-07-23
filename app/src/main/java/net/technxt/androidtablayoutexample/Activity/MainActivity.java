package net.technxt.androidtablayoutexample.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

import net.technxt.androidtablayoutexample.Adapter.TabViewPagerAdapter;
import net.technxt.androidtablayoutexample.Fragment.FragmentFour;
import net.technxt.androidtablayoutexample.Fragment.FragmentOne;
import net.technxt.androidtablayoutexample.Fragment.FragmentThree;
import net.technxt.androidtablayoutexample.Fragment.FragmentTwo;
import net.technxt.androidtablayoutexample.R;

public class MainActivity extends AppCompatActivity {


    AppBarLayout appBarLayout;
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    TabViewPagerAdapter tabViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appBarLayout = findViewById(R.id.appBarLayout);
        toolbar = findViewById(R.id.toolbar);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewpager);
        setSupportActionBar(toolbar);

        initTabs();

    }

    private void initTabs() {
        tabViewPagerAdapter = new TabViewPagerAdapter(getSupportFragmentManager());
        tabViewPagerAdapter.addFragment(new FragmentOne(), "One");
        tabViewPagerAdapter.addFragment(new FragmentTwo(), "Two");
        tabViewPagerAdapter.addFragment(new FragmentThree(), "Three");
        tabViewPagerAdapter.addFragment(new FragmentFour(), "Four");
        viewPager.setAdapter(tabViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

}
