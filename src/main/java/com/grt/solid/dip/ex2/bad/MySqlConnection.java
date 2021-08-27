package com.grt.solid.dip.ex2.bad;

public class MySqlConnection {

    MySqlConnection(){
        initialize();
    }

    void initialize(){
        System.out.println("Init Connection");
    }

    void insert(){
        System.out.println("Insert");
    }

    void delete(){
        System.out.println("Delete");
    }


}
