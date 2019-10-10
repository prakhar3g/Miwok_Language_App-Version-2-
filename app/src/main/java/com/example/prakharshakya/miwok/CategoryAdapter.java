package com.example.prakharshakya.miwok;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context,FragmentManager fm)
    {
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new NumbersFragment();
            case 1:
                return new FamilyMembersFragment();
            case 2:
                return new ColorsFragment();
            case 3:
                return new PhrasesFragment();
            default:
                return null;

        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return mContext.getString(R.string.category_numbers);
            case 1:
                return mContext.getString(R.string.categoty_family);
            case 2:
                return mContext.getString(R.string.categoty_colors);
            case 3:
                return mContext.getString(R.string.category_phrases);
            default:
                return null;
        }
    }

}
