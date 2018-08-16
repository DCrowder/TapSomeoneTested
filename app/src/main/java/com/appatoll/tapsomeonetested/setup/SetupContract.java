package com.appatoll.tapsomeonetested.setup;

import com.appatoll.tapsomeonetested.BasePresenter;
import com.appatoll.tapsomeonetested.BaseView;
import com.appatoll.tapsomeonetested.start.StartContract;

import java.util.Locale;

public interface SetupContract {

    interface View extends BaseView<SetupContract.Presenter> {
        void showGame();

        boolean isActive();

        void setPresenter(Presenter presenter);
    }

    interface Presenter extends BasePresenter {
        void startGame();
    }
}
