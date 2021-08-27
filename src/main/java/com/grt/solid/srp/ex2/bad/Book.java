package com.grt.solid.srp.ex2.bad;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {

    private String name;
    private String author ;
    private String content ;

    public void print(){
        System.out.print(content);
    }

}
