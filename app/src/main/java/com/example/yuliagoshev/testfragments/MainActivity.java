package com.example.yuliagoshev.testfragments;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout= (TabLayout) findViewById(R.id.tabs);

        // Find the view pager that will allow the user to swipe between fragments
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        adapter=new ViewPagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(new PalacesFragment(),"Palaces");
        adapter.AddFragment(new CathedralsFragment(),"Cathedrals");
        adapter.AddFragment(new MuseumsFragment(),"Museums");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        //Remove shadov from the action bar
        ActionBar actionBar=getSupportActionBar();
        actionBar.setElevation(0);



    }
}
