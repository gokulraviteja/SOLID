package com.grt.solid.lsp.ex1.bad;

public class TemporaryEmployee extends Employee{
    public TemporaryEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    protected double calculateBonus(double salary) {
        return 0;
    }

    @Override
    public double getMinSalary() {
        return 5000;
    }
}
