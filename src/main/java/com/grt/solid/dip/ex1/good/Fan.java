package com.grt.solid.dip.ex1.good;

public class Fan implements Device{




    @Override
    public void on() {
        System.out.println("Fan on");

    }

    @Override
    public void off() {
        System.out.println("Fan off");

    }


    public void setSpeed(){
        System.out.println("Setting Speed");
    }


}
