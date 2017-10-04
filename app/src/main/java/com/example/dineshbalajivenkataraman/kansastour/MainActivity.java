package com.example.dineshbalajivenkataraman.kansastour;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.dineshbalajivenkataraman.kansastour.Adapters.SectionsPageAdapter;
import com.example.dineshbalajivenkataraman.kansastour.Fragments.Arts_Fragment;
import com.example.dineshbalajivenkataraman.kansastour.Fragments.Food_Fragment;
import com.example.dineshbalajivenkataraman.kansastour.Fragments.Places_Fragment;
import com.example.dineshbalajivenkataraman.kansastour.Fragments.Shopping_Fragment;

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
        sectionsPageAdapter.addFragment(new Places_Fragment(), getString(R.string.places_tab));
        sectionsPageAdapter.addFragment(new Food_Fragment(), getString(R.string.food_tab));
        sectionsPageAdapter.addFragment(new Shopping_Fragment(),getString(R.string.shopping_tab));
        sectionsPageAdapter.addFragment(new Arts_Fragment(), getString(R.string.arts_tab));
        viewPager.setAdapter(sectionsPageAdapter);
    }
}
