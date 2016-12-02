package com.example.thanhhang.mnsfimo.Activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.thanhhang.mnsfimo.Adapters.IntroAdapter;
import com.example.thanhhang.mnsfimo.R;

public class IntroduceActivity extends AppCompatActivity {
    ViewPager pager2;
    TabLayout tabLayout2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduce);
        getSupportActionBar().hide();
        // Code viewpager
        pager2 = (ViewPager) findViewById(R.id.view_pager2);
        tabLayout2 = (TabLayout) findViewById(R.id.tab2_layout);
        FragmentManager manager = getSupportFragmentManager();
        IntroAdapter adapter2 = new IntroAdapter(manager);
        pager2.setAdapter(adapter2);
        tabLayout2.setupWithViewPager(pager2);
        pager2.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout2));
        tabLayout2.setTabsFromPagerAdapter(adapter2);
    }
}
