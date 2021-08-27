package com.grt.solid.isp.ex2.bad;

public class Pilot implements Soldier{
    @Override
    public void causeDamage() {

    }

    @Override
    public void fly() {
        System.out.println("Can Fly ");
    }

    @Override
    public void walk() {
        throw new RuntimeException("Invalid ");
    }

    @Override
    public void teleport() {
        throw new RuntimeException("Invalid ");
    }
}
