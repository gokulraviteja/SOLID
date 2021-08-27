package com.grt.solid.dip.ex3.good;


public class BusinessLogic {


    Notifier n ;
    BusinessLogic(Notifier n){
        this.n = n;
    }

    void updateWeather(String s ){
        n.sendNotification(s);
    }


}
