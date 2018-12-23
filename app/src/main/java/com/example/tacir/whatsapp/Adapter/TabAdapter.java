package com.example.tacir.whatsapp.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.tacir.whatsapp.Fragments.CallsFragment;
import com.example.tacir.whatsapp.Fragments.CameraFragment;
import com.example.tacir.whatsapp.Fragments.ChatFragment;
import com.example.tacir.whatsapp.Fragments.StoryFragment;


public class TabAdapter extends FragmentPagerAdapter {

    public TabAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            switch (position) {
                case 0:
                    return new  CameraFragment();
                case 1:
                    return new ChatFragment();
                case 2:
                    return new StoryFragment();
                case 3:
                    return new CallsFragment();
            }

            return null;
        }


        @Override
        public int getCount() {
            // Show 2 total pages.
            return 4;
        }
    }

