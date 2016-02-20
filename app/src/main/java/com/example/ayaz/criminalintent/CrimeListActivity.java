package com.example.ayaz.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Ayaz on 20.01.2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
