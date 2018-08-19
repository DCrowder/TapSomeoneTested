package com.appatoll.tapsomeone.setup;

import android.support.v4.app.Fragment;

import com.appatoll.tapsomeone.SingleFragmentActivity;

public class SetupActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return SetupFragment.newInstance();
    }
}
