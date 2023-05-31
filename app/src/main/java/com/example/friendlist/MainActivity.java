package com.example.friendlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Fragment> fragments = new ArrayList<Fragment>();
        fragments.add(new FriendList());
        fragments.add(new MostCaring());
        MyFragmentAdapter adapter = new MyFragmentAdapter(getSupportFragmentManager(), fragments);
        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);
    }
}