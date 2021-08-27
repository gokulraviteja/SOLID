package com.grt.solid.srp.ex1.good;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle {

    private final int  maxFuel ;
    private int remainingFuel ;

    public Vehicle(int maxFuel){
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }


}
