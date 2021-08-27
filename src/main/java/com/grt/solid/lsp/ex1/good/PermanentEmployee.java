package com.grt.solid.lsp.ex1.good;

import com.grt.solid.lsp.ex1.bad.Employee;

public class PermanentEmployee extends Employee implements EligibleForBonus {


    public PermanentEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus(double salary) {
        return 0;
    }

    @Override
    public double getMinSalary() {
        return 10000;
    }
}
