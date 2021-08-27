package com.grt.solid.lsp.ex1.bad;

public class ContractEmployee extends Employee{
    public ContractEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    protected double calculateBonus(double salary) {
        throw new RuntimeException("Not applicable");
    }

    @Override
    public double getMinSalary() {
        return 4000;
    }

}
