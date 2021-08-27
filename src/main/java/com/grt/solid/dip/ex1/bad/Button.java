package com.grt.solid.dip.ex1.bad;

public class Button {

    Lamp lamp;

    Button(Lamp lamp){
        this.lamp = lamp;
    }

    void toggle(){
        if(lamp.getState().equals(State.ON)){
            lamp.off();
        }
        else {
            lamp.on();
        }
    }


}
