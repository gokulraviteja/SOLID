package com.grt.solid.lsp.ex1.bad;

public class PermanentEmployee extends  Employee{



    public PermanentEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    protected double calculateBonus(double salary) {
        return 0;
    }

    @Override
    public double getMinSalary() {
        return 10000;
    }
}
