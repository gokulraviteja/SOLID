package com.grt.solid.dip.ex1.good;



public class Button {


    Device device;
    State state;

    Button(Device device){
        this.device = device;
        this.state = State.OFF;
    }

    void toggle(){
        if(state.equals(State.ON)){
            device.off();
        }
        else {
            device.on();
        }
    }


}
