package com.appatoll.tapsomeone.setup;

import com.appatoll.tapsomeone.BasePresenter;
import com.appatoll.tapsomeone.BaseView;
import com.appatoll.tapsomeone.start.StartContract;

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
