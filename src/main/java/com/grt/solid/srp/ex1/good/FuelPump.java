package com.grt.solid.srp.ex1.good;


public class FuelPump {

    public void reFuel(Vehicle v){
        v.setRemainingFuel(v.getMaxFuel());
    }

}
