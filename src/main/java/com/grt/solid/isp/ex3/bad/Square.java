package com.grt.solid.isp.ex3.bad;

public class Square implements IShape{

    @Override
    public void drawCircle() {
        throw new RuntimeException("Not Applicable");
    }

    @Override
    public void drawSquare() {

    }
}
