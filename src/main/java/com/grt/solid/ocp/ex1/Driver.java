package com.grt.solid.ocp.ex1;

import com.grt.solid.ocp.ex1.bad.Student;
import com.grt.solid.ocp.ex1.good.GraduateStudent;
import com.grt.solid.ocp.ex1.good.HighSchoolStudent;

public class Driver {


    public static void main(String[] args) {

        // Bad
        com.grt.solid.ocp.ex1.bad.Student s1 = new com.grt.solid.ocp.ex1.bad.Student("s1","normal");
        com.grt.solid.ocp.ex1.bad.Student s2 = new com.grt.solid.ocp.ex1.bad.Student("s2","graduated");

        s1.introduce();
        s2.introduce();

        // In future lets say there is a new type of student - medicalStudent -- changes to be done in Student class

        // Good

        com.grt.solid.ocp.ex1.good.Student s3 =  new HighSchoolStudent("s3" , "highschool" );
        com.grt.solid.ocp.ex1.good.Student s4 =  new GraduateStudent("s4" , "graduated" );
        com.grt.solid.ocp.ex1.good.Student s5 =  new com.grt.solid.ocp.ex1.good.Student("s4" , "graduated" );

        s3.introduce();
        s4.introduce();
        s5.introduce();



    }

}
