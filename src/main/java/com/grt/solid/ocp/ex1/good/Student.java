package com.grt.solid.ocp.ex1.good;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public  class Student {

    private String name;
    private String type;

    public  void introduce(){
        System.out.println("I am a normal Student");
    }

}
