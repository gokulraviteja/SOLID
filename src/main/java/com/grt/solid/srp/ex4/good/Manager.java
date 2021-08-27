package com.grt.solid.srp.ex4.good;

public class Manager extends Employee{

    public Manager(int id, String name, int level) {
        super(id, name, level);
    }

    public void promoteEmployee(Employee e ){
        if(this==e){
            System.out.println("Restricted");
            return;
        }
        e.setLevel(e.getLevel()+1);
        System.out.println(e.getName() + " got promoted to "+ e.getLevel());
    }

    public void fireEmployee(Employee e ){
        // Lol
    }



}
