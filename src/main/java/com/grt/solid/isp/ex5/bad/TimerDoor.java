package com.grt.solid.isp.ex5.bad;

public class TimerDoor implements Door{
    @Override
    public void lock() {

    }

    @Override
    public void unLock() {

    }

    @Override
    public void timeOutCallBack() {

    }

    @Override
    public void proximityCallBack() {
        throw new RuntimeException("Not Applicable!");
    }
}
