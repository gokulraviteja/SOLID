package com.grt.solid.lsp.ex5.bad;

import java.util.Arrays;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        List<Spaceship> captReynoldsFleet = Arrays.asList(new ToyShip(), new ToyShip());
        List<Spaceship> captAdamaFleet = Arrays.asList(new FighterShip(), new FighterShip());
        for (Spaceship spaceship: captReynoldsFleet) {
            spaceship.shoot("Capt. Adama");
        }
        for (Spaceship spaceship: captAdamaFleet) {
            spaceship.shoot("Capt. Reynolds");
        }

        // Make sure that each derived class is not only a proper child of its parent on a surface level but also matches the expected behavior of the parent class and will not lead to unexpected behavior when used by clients.
    }

}
