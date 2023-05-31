package com.example.friendlist;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class MyFragmentAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> friendLists;

    public MyFragmentAdapter(@NonNull FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        friendLists = fragments;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return friendLists.get(position);
    }

    @Override
    public int getCount() {
        return friendLists.size();
    }
}
