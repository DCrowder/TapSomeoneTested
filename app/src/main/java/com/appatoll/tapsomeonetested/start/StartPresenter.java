package com.appatoll.tapsomeonetested.start;

import android.support.annotation.NonNull;

import java.util.Locale;

public class StartPresenter implements StartContract.Presenter {

    private final StartContract.View mStartView;

    public StartPresenter(@NonNull StartContract.View startView){
        try {
            mStartView = startView;

        } catch (Exception e) {
            throw new RuntimeException("StartView cannot be null!");
        }
        mStartView.setPresenter(this);
    }

    @Override
    public void startGame() {

    }

    @Override
    public void startTutorial() {

    }

    @Override
    public void changeLocale(Locale locale) {

    }

    @Override
    public void start() {

    }
}
