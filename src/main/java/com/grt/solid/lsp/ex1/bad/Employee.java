package com.grt.solid.lsp.ex1.bad;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Employee {

    String name;
    double salary;

    protected abstract double calculateBonus(double salary) ;

    public abstract double getMinSalary() ;


}
