package com.grt.solid.srp.ex3.bad;

import lombok.Getter;

@Getter
public class Car
{
    private final String id;
    private final String brand;

    public Car(String id, String brand)
    {
        this.id = id;
        this.brand = brand;
    }

}