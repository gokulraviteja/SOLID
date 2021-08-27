package com.grt.solid.isp.ex1.bad;

public class Student implements Study{


    @Override
    public void createPaper() {

    }

    @Override
    public void createThesis() {
        throw new RuntimeException("Not Applicable");
    }
}
