package com.grt.solid.dip.ex3.bad;

public class BusinessLogic {

    Emailer e ;
    BusinessLogic(Emailer e){
        this.e = e;
    }

    void updateWeather(String s ){
        e.sendNotification(s);
    }


}
