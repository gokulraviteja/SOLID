package com.grt.solid.lsp.ex4.bad;

public abstract class Employee {
    private int id;
    private String name;
    abstract void sendCommunication();
}
class TechnicalStaff extends Employee {
    void maintainSystems(){}
    void sendCommunication(){} //this is a problem
}

class Manager extends Employee {

    void promoteDirectReport(Employee employee){}
    void sendCommunication(){} //action allowed

}

class Director extends Employee {

    void promoteDirectReport(Employee employee) {}
    void sendCommunication() {
    } //action allowed

}

