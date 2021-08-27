package com.grt.solid.srp.ex4.bad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Employee {

    private int id;
    private String name ;
    private int level;


    void promoteEmployee(Employee e){
        if(this.equals(e)){
            System.out.println("One cannot promote his/her level");
            return;
        }
        if(level>3){
            e.level += 1;
            System.out.println(e.name + " got promoted to " + e.level);
        }
    }

    void restartJobs(){
        if(level==-1){
            System.out.println("Restarting");
        }

    }


    public static void main(String[] args) {
        Employee rahul = new Employee(1 , "rahul" , 2);
        Employee dev = new Employee(2 , "dev" , 3);
        Employee priyanka = new Employee(3 , "priyanka" , 5);
        Employee occ = new Employee(4 , "occ" , -1);

        priyanka.promoteEmployee(rahul);
        priyanka.promoteEmployee(dev);
        occ.restartJobs();
        priyanka.promoteEmployee(priyanka);


    }

}
