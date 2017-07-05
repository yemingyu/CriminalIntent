package com.example.yemingyu.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by yemingyu on 04/07/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
