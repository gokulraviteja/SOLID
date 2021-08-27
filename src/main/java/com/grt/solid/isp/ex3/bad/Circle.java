package com.grt.solid.isp.ex3.bad;

public class Circle implements IShape{

    @Override
    public void drawCircle() {

    }

    @Override
    public void drawSquare() {
        throw new RuntimeException("Not Applicable");
    }
}
