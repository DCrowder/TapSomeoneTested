package com.appatoll.tapsomeonetested;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * StartFragment contains two buttons: start and instructions.
 *
 * -    Start button starts the game
 * -    Instructions provides a popup message with instructions on how to play
 *      -   TODO: 7/16/2018 Would like to make a tutorial eventually...
 *
 */

public class StartFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_start, container, false);
        return v;
    }
}
