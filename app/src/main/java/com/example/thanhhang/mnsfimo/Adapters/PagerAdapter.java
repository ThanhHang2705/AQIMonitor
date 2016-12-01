package com.example.thanhhang.mnsfimo.Adapters;

/**
 * Created by ThanhHang on 12/2/2016.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.thanhhang.mnsfimo.FragmentMain.ListmainFragment;
import com.example.thanhhang.mnsfimo.FragmentMain.MapFragment;
import com.example.thanhhang.mnsfimo.FragmentMain.SearchFragment;


public class PagerAdapter  extends FragmentStatePagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment frag=null;
        switch (position){
            case 0:
                frag=new ListmainFragment();
                break;
            case 1:
                frag=new MapFragment();
                break;
            case 2:
                frag=new SearchFragment();
                break;
        }
        return frag;
    }
    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title="Home";
                break;
            case 1:
                title="Map";
                break;
            case 2:
                title="Tim kiem";
                break;
        }

        return title;
    }

}

