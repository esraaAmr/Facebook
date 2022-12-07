package com.example.splach_screen.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.splach_screen.Fragments.HomeFragment;
import com.example.splach_screen.Fragments.MenuFragment;
import com.example.splach_screen.Fragments.WatchFragment;

import java.util.ArrayList;

public class viewAdapter extends FragmentStateAdapter {
    private int count;

    public viewAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle, int count) {
        super(fragmentManager, lifecycle);
        this.count=count;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new WatchFragment();
            case 2:
                return new MenuFragment();
        }
        return new Fragment();
    }

    @Override
    public int getItemCount() {
        return count;
    }
}
