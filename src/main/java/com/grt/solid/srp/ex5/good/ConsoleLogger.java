package com.grt.solid.srp.ex5.good;

public class ConsoleLogger implements Logger{

    @Override
    public void log(String errorToBeLogged) {
        System.out.println(errorToBeLogged);
    }
}
