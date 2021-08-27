package com.grt.solid.lsp.ex4.good;


abstract class ManagementStaff extends Employee {
    void promoteDirectReport(Employee employee){}
    abstract void sendCommunication();
}

