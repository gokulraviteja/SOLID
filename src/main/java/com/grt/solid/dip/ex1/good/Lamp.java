package com.grt.solid.dip.ex1.good;

import lombok.Getter;

@Getter
public class Lamp implements Device{


    @Override
    public void on() {

        System.out.println("On");
    }

    @Override
    public void off() {

        System.out.println("Off");
    }

}
