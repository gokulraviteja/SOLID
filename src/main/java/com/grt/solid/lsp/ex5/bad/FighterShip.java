package com.grt.solid.lsp.ex5.bad;

public class FighterShip implements Spaceship {
    @Override
    public void shoot(String enemy) {
        System.out.println("Actually shooting at " + enemy);
    }
}
