package com.appatoll.tapsomeonetested.setup;

import android.support.v4.app.Fragment;

import com.appatoll.tapsomeonetested.SingleFragmentActivity;

public class SetupActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return SetupFragment.newInstance();
    }
}
