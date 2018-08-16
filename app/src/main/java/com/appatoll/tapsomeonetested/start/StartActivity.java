package com.appatoll.tapsomeonetested.start;

import android.content.Intent;
import android.support.v4.app.Fragment;

import com.appatoll.tapsomeonetested.SingleFragmentActivity;
import com.appatoll.tapsomeonetested.setup.SetupActivity;
import com.appatoll.tapsomeonetested.start.StartFragment;

public class StartActivity extends SingleFragmentActivity implements StartFragment.OnClickListener {

    @Override
    protected Fragment createFragment() {
        return StartFragment.newInstance();
    }


    @Override
    public void onStartClick() {
        Intent i = new Intent(StartActivity.this, SetupActivity.class);
        startActivity(i);
    }

    @Override
    public void onTutorialClick() {

    }

    @Override
    public void onLanguageOptionsClick() {

    }
}