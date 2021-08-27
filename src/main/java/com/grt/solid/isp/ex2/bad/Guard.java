package com.grt.solid.isp.ex2.bad;

public class Guard implements Soldier{
    @Override
    public void causeDamage() {

    }

    @Override
    public void walk() {
        System.out.println("Ground soldier");
    }

    @Override
    public void fly() {
        throw new RuntimeException("Invalid ");
    }



    @Override
    public void teleport() {
        throw new RuntimeException("Invalid ");
    }
}
