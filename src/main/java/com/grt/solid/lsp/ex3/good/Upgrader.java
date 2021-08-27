package com.grt.solid.lsp.ex3.good;

import com.grt.solid.lsp.ex3.bad.Apartment;
import com.grt.solid.lsp.ex3.bad.Home;

import java.util.List;

public class Upgrader {

    void upgrade(Home home){
        home.setBedRooms(home.getBedRooms()+1);
    }
}
