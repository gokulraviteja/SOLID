package com.grt.solid.dip.ex2.bad;

public class DriverCode {

    public static void main(String[] args) {

        MySqlConnection connection = new MySqlConnection();
        StudentRepository studentRepository = new StudentRepository(connection);

        studentRepository.save();
        studentRepository.delete();


    }

}
