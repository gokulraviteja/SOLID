package com.grt.solid.lsp.ex5.good;

import java.util.Arrays;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        List<Spaceship> captReynoldsFleet = Arrays.asList(new FighterShip(), new FighterShip());
        List<Spaceship> captAdamaFleet = Arrays.asList(new FighterShip(), new FighterShip());


        // no longer using toyship as its not actually a spaceship

        for (Spaceship spaceship: captReynoldsFleet) {
            spaceship.shoot("Capt. Adama");
        }
        for (Spaceship spaceship: captAdamaFleet) {
            spaceship.shoot("Capt. Reynolds");
        }
    }

}
