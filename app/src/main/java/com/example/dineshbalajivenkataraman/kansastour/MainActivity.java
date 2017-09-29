package com.example.dineshbalajivenkataraman.kansastour;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private SectionsPageAdapter mSectionsPageAdapter;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager)findViewById(R.id.container);
        setupViewPage(mViewPager);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Kansas Tour Guide");

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);



    }

    private void setupViewPage(ViewPager viewPager)
    {
        SectionsPageAdapter sectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        sectionsPageAdapter.addFragment(new Places_Fragment(), "Places");
        sectionsPageAdapter.addFragment(new Food_Fragment(), "Food");
        sectionsPageAdapter.addFragment(new Shopping_Fragment(),"Shopping");
        sectionsPageAdapter.addFragment(new Arts_Fragment(), "Extras");
        viewPager.setAdapter(sectionsPageAdapter);
    }



}
