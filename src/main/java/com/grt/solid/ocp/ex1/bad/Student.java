package com.grt.solid.ocp.ex1.bad;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Student {

    private String name;
    private String type;

    public void  introduce(){
        if(type.equals("normal")){
            System.out.println("I am a normal Student");
        }
        else if(type.equals("highschool")){
            System.out.println("I am a highschool Student");
        }
        else if(type.equals("graduated")){
            System.out.println("I am a graduate Student");
        }
    }

}
