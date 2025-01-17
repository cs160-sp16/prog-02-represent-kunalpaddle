package com.example.kunalpatel.represent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import java.util.ArrayList;

class FragmentAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> mFragments;
    private Fragment mCurrentFragment;
//    private final Context context;


    public FragmentAdapter(FragmentManager fm) {
        super(fm);
        mFragments = new ArrayList<Fragment>();
        // TODO Auto-generated constructor stub
    }
//    public FragmentAdapter(Context context, FragmentManager fm) {
//        super(fm);
//        this.context = context;
//        mFragments = new ArrayList<Fragment>();
//        // TODO Auto-generated constructor stub
//    }



    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }


    public void addFragment(Fragment fragment) {
        // TODO Auto-generated method stub
        mFragments.add(fragment);
        // Update the pager when adding a fragment.
        notifyDataSetChanged();

    }
    @Override
    public void setPrimaryItem(ViewGroup container, int position, Object object) {
        if (getCurrentFragment() != object) {
            mCurrentFragment = ((Fragment) object);
        }
        super.setPrimaryItem(container, position, object);
    }
    public Fragment getCurrentFragment() {
        return mCurrentFragment;
    }

}
