package com.grt.solid.ocp.ex2.good;

public class Parrot extends Animal{

    public Parrot(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("Parrot Sound");
    }
}
