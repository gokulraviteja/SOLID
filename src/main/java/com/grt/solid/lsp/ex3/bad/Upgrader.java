package com.grt.solid.lsp.ex3.bad;

import java.util.List;

public class Upgrader {

    void upgrade(List<Apartment> apartments){
        for(Apartment apartment : apartments){
            apartment.setSqft(apartment.getSqft()+20);
            if(apartment instanceof Home){
                apartment.setBedRooms(apartment.getBedRooms()+1);
            }
        }
    }
}
