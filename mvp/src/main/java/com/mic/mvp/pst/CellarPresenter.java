package com.mic.mvp.pst;

import com.mic.model.entities.WineList;
import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;


/**
 * Created by tomywu on 7/9/15.
 */
public class CellarPresenter extends Presenter {
    private WineList mWineList;
    private final Bus mBus;


    public CellarPresenter (Bus bus) {
        mBus = bus;
    }

    @Override
    public void start() {

        mBus.register(this);

    }

    @Override
    public void stop() {
        mBus.unregister(this);
    }

    @Subscribe
    public void onWineReceived(WineList response){
        //System.out.println("testtest: " + response.getTitle());
        mWineList = response;
    }
}
