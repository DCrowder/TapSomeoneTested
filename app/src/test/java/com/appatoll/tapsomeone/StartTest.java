package com.appatoll.tapsomeone;

import com.appatoll.tapsomeone.start.StartContract;
import com.appatoll.tapsomeone.start.StartPresenter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class StartTest {

    @Mock
    private StartContract.View mStartView;

    private StartPresenter mStartPresenter;

    @Before
    public void setupStartPresenter(){
        MockitoAnnotations.initMocks(this);

        mStartPresenter = new StartPresenter(mStartView);

        when(mStartView.isActive()).thenReturn(true);

    }

    @Test
    public void createPresenter_setsPresenterToView(){
        // New reference to class under test
        mStartPresenter = new StartPresenter(mStartView);

        //Set presenter to view
        verify(mStartView).setPresenter(mStartPresenter);
    }

    @Test
    public void startGame_launchesGame(){
        mStartPresenter.startGame();

        verify(mStartView).showSetup();
    }

}
