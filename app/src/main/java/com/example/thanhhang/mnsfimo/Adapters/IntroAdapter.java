package com.example.thanhhang.mnsfimo.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.thanhhang.mnsfimo.FragmentMain.IntroPMFragment;
import com.example.thanhhang.mnsfimo.FragmentMain.IntroProductFragment;

/**
 * Created by ThanhHang on 12/2/2016.
 */

public class IntroAdapter extends FragmentStatePagerAdapter {
    public IntroAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag=null;
        switch (position){
            case 0:
                frag= new IntroProductFragment();
                break;
            case 1:
                frag=new IntroPMFragment();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title="Sản Phẩm";
                break;
            case 1:
                title="PM 2.5";
                break;
        }

        return title;
    }
}
