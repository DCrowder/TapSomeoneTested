package com.appatoll.tapsomeonetested.start;

import com.appatoll.tapsomeonetested.BasePresenter;
import com.appatoll.tapsomeonetested.BaseView;

import java.util.Locale;

public interface StartContract {

    interface View extends BaseView<Presenter>{
        void showTutorial();

        void showGame();

        void showLanguage(Locale locale);

        void showLanguageOptions();

        boolean isActive();

        void setPresenter(Presenter presenter);
    }

    interface Presenter extends BasePresenter {
        void startGame();

        void startTutorial();

        void changeLocale(Locale locale);
    }
}
