package com.grt.solid.isp.ex4.bad;

public class Human implements Worker{


    @Override
    public void work() {
        System.out.println("Human working");
    }

    @Override
    public void eat() {
        System.out.println("Human eating");
    }
}
