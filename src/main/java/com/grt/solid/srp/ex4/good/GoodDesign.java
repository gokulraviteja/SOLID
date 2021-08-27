package com.grt.solid.srp.ex4.good;

// just a driver class to demo Single responsibility principle
// Good design - better than the bad design where Employee class is responsible for everything .
public class GoodDesign {

    public static void main(String[] args) {

        Manager priyanka  = new Manager(1 , "priyanka" , 5);
        Employee rahul  = new Employee(2, "rahul", 2) ;
        Employee dev  = new Employee(3, "dev", 3) ;
        TechnicalStaff occ  = new TechnicalStaff(4, "occ", -1) ;


        priyanka.promoteEmployee(dev);
        priyanka.fireEmployee(rahul);
        // irony
        int age = 0;
        while(age++!=100){
            priyanka.promoteEmployee(priyanka);
        }
    }

}
