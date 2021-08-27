package com.grt.solid.ocp.ex4.good;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Employee {
    private String name;
    private String type;
    private double salary;

    public abstract double calculateBonus(double salary);
}
