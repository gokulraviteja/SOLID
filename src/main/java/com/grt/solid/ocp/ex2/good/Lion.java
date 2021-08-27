package com.grt.solid.ocp.ex2.good;

public class Lion extends Animal{

    public Lion(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("Lion Sound");
    }
}
