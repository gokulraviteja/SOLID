package com.grt.solid.dip.ex2.good;

public class StudentRepository {

    private Connection connection;

    public StudentRepository(Connection connection){
        this.connection = connection;
    }
    public void save() {
        connection.insert();
    }
    public void delete() {
        connection.delete();
    }

}
