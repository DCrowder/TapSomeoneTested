package com.appatoll.tapsomeonetested;

import android.app.Activity;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StartTest {
    private StartActivity startActivity;
    private StartFragment startFragment;

    @Before
    public void activity_createsFragment(){
        startActivity = new StartActivity();
        startFragment = (StartFragment) startActivity.createFragment();
    }

    @Test
    public void activity_hasFragment(){
        assertNotEquals(startFragment, null);
    }

    @Test
    public void activity_Exists(){
        assertNotEquals(startActivity,null);
    }
}
