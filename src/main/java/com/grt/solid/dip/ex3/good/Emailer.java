package com.grt.solid.dip.ex3.good;

public class Emailer implements  Notifier{

    @Override
    public void sendNotification(String s) {
        System.out.println("Send email notification :" + s);
    }
}
