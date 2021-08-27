package com.grt.solid.dip.ex2.good;

public class MySqlConnection implements  Connection {

    MySqlConnection(){
        initialize();
    }

    @Override
    public void initialize(){
        System.out.println("Sql Init Connection");
    }

    @Override
    public void insert(){
        System.out.println("Sql Insert");
    }

    @Override
    public void delete(){
        System.out.println("Sql Delete");
    }


}
