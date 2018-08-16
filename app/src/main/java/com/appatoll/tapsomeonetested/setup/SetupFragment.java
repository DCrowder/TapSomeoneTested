package com.appatoll.tapsomeonetested.setup;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appatoll.tapsomeonetested.R;
import com.appatoll.tapsomeonetested.start.StartContract;

public class SetupFragment extends Fragment implements SetupContract.View {

    private SetupContract.Presenter mPresenter;

    public SetupFragment(){}

    public static Fragment newInstance() {
        return new SetupFragment();
    }

    @Override
    public void showGame() {

    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void setPresenter(@NonNull SetupContract.Presenter presenter) {
        try {
            mPresenter = presenter;
        } catch (Exception e){
            throw new RuntimeException("Presenter cannot be null!");
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_setup, container, false);
        return v;
    }
}
