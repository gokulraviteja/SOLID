package com.grt.solid.isp.ex2.bad;

public class Witch implements Soldier{
    @Override
    public void causeDamage() {

    }

    @Override
    public void teleport() {
        System.out.println("Witch is also helping army these days by teleporting");
    }

    @Override
    public void fly() {
        throw new RuntimeException("Invalid ");
    }

    @Override
    public void walk() {
        throw new RuntimeException("Invalid ");
    }


}
