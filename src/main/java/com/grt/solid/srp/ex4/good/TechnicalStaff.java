package com.grt.solid.srp.ex4.good;

public class TechnicalStaff extends Employee{

    public TechnicalStaff(int id, String name, int level) {
        super(id, name, level);
    }

    public void restartJobs(){
        System.out.println("I don't want to restart your jobs");
    }

}
