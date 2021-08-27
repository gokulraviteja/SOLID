package com.grt.solid.lsp.ex1.good;

import com.grt.solid.lsp.ex1.bad.Employee;

public class ContractEmployee  extends Employee {

    public ContractEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    protected double calculateBonus(double salary) {
        return 0;
    }

    @Override
    public double getMinSalary() {
        return 4000;
    }
}
