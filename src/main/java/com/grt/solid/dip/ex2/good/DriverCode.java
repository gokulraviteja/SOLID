package com.grt.solid.dip.ex2.good;

public class DriverCode {

    public static void main(String[] args) {

        Connection connection = new MySqlConnection();

        StudentRepository studentRepository = new StudentRepository(connection);
        studentRepository.save();
        studentRepository.delete();


        connection = new PsqlConnection();
        studentRepository = new StudentRepository(connection);
        studentRepository.save();
        studentRepository.delete();




    }

}
