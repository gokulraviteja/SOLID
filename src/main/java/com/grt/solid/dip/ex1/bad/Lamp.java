package com.grt.solid.dip.ex1.bad;

import lombok.Getter;

@Getter
public class Lamp {

    State state;

    Lamp(){
        state = State.OFF;
    }

    public void on(){
        System.out.println("On");
        state = State.ON;
    }

    public void off(){
        System.out.println("Off");
        state = State.OFF;
    }


}
