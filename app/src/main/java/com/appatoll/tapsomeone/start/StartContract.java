package com.appatoll.tapsomeone.start;

import com.appatoll.tapsomeone.BasePresenter;
import com.appatoll.tapsomeone.BaseView;

import java.util.Locale;

public interface StartContract {

    interface View extends BaseView<Presenter>{

        void showTutorial();

        void showSetup();

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
