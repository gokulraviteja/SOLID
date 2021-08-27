package com.grt.solid.lsp.ex5.bad;

public class ToyShip implements Spaceship {
    @Override
    public void shoot(String enemy) {
        System.out.println("I am a toy , I cant actually shoot");
        // i am like then why are u acting like a spaceship which actually should shoot
    }
}