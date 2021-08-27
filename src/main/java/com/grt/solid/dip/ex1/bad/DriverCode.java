package com.grt.solid.dip.ex1.bad;

public class DriverCode {
    public static void main(String[] args) {

        Lamp l = new Lamp();

        Button b = new Button(l);

        b.toggle();
        b.toggle();
        b.toggle();
        b.toggle();



    }
}
