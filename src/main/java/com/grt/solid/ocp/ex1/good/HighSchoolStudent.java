package com.grt.solid.ocp.ex1.good;

public class HighSchoolStudent extends Student{

    public HighSchoolStudent(String name, String type) {
        super(name, type);
    }

    @Override
    public void introduce() {
        System.out.println("I am a high school student");
    }
}
