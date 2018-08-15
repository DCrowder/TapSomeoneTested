package com.appatoll.tapsomeonetested.start;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appatoll.tapsomeonetested.R;

import java.util.Locale;

/**
 * StartFragment contains two buttons: start and instructions.
 *
 * -    Start button starts the game
 * -    Instructions provides a popup message with instructions on how to play
 *      -   TODO: 7/16/2018 Would like to make a tutorial eventually...
 *
 */

public class StartFragment extends Fragment implements StartContract.View {

    private StartContract.Presenter mPresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_start, container, false);
        return v;
    }

    @Override
    public void showTutorial() {

    }

    @Override
    public void showGame() {

    }

    @Override
    public void showLanguage(Locale locale) {

    }

    @Override
    public void showLanguageOptions() {

    }

    @Override
    public boolean isActive() {
        return isAdded();
    }

    @Override
    public void setPresenter(@NonNull StartContract.Presenter presenter) {
        try {
            mPresenter = presenter;
        } catch (Exception e){
            throw new RuntimeException("Presenter cannot be null!");
        }
    }
}
