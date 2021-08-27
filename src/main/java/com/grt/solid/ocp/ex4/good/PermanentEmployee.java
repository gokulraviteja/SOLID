package com.grt.solid.ocp.ex4.good;

public class PermanentEmployee extends Employee{

    public PermanentEmployee(String name, String type, double salary) {
        super(name, type, salary);
    }


    @Override
    public double calculateBonus(double salary) {
        return 0.3*salary;
    }

}
