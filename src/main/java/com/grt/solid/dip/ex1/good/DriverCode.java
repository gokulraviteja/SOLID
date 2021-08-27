package com.grt.solid.dip.ex1.good;


public class DriverCode {
    public static void main(String[] args) {

        Lamp l = new Lamp();
        Button b = new Button(l);
        b.toggle();
        b.toggle();
        b.toggle();
        b.toggle();

        Fan f = new Fan();

        b = new Button(f);
        b.toggle();
        b.toggle();


    }
}
