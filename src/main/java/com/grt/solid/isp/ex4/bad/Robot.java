package com.grt.solid.isp.ex4.bad;

public class Robot implements Worker{

    @Override
    public void work() {
        System.out.println("Robot working");
    }

    @Override
    public void eat() {
        throw new RuntimeException("Robot Cannot Eat");
    }
}
