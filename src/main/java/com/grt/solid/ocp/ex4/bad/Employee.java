package com.grt.solid.ocp.ex4.bad;

// violating both srp and ocp
public class Employee {

    private String name;
    private String type;
    private double salary;

    double calculateBonus(){
        if(type.equals("Permanent")){
            return salary*0.3;
        }
        else if(type.equals("Temporary")){
            return salary*0.2;
        }
        else{
            return 0.0;
        }
    }

}
