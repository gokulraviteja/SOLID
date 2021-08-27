package com.grt.solid.ocp.ex4.good;

public class ContractEmployee extends Employee{

    public ContractEmployee(String name, String type, double salary) {
        super(name, type, salary);
    }

    @Override
    public double calculateBonus(double salary) {
        return 0.2*salary;
    }

}
