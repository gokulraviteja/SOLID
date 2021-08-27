package com.grt.solid.srp.ex1.bad;

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

    // Its not the property of the vehicle , its the property of the fuel pump
    public void reFuel(){
        remainingFuel = maxFuel;
    }

}
