package com.appatoll.tapsomeonetested.start;

import android.support.v4.app.Fragment;

import com.appatoll.tapsomeonetested.SingleFragmentActivity;
import com.appatoll.tapsomeonetested.start.StartFragment;

public class StartActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new StartFragment();
    }
}