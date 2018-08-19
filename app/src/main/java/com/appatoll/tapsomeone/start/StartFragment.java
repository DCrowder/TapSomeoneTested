package com.appatoll.tapsomeone.start;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.appatoll.tapsomeone.R;

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

    private OnClickListener mListener;

    private StartContract.Presenter mPresenter;
    private Button mStartButton;
    private Button mTutorialButton;
    private Button mLanguageOptionsButton;

    public StartFragment(){}

    public static StartFragment newInstance() { return new StartFragment(); }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_start, container, false);

        mStartButton = (Button) v.findViewById(R.id.start_button);

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSetup();
            }
        });

        return v;
    }

    @Override
    public void showTutorial() {

    }

    @Override
    public void showSetup() {
        mListener.onStartClick();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mListener = (OnClickListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + "must implement ClickListener methods");
        }
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

    interface OnClickListener{
        void onStartClick();
        void onTutorialClick();
        void onLanguageOptionsClick();
    }


}
