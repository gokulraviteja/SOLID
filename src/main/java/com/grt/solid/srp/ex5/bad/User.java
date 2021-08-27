package com.grt.solid.srp.ex5.bad;

public class User {

    private String name;
    private String email;


    public void login(String username , String password){
        System.out.println("Logging in");
    }

    public void register(String username , String password){
        System.out.println("Registering");
    }

    public void sendEmail(User u ){
        System.out.println("Sending Email");
    }

    public void log(String errorToBeLogged){
        System.out.println("Logging the error");
    }

}
