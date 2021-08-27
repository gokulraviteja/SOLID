package com.grt.solid.ocp.ex2.good;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public abstract class Animal {
    private String name;
    abstract void sound();

    public static void main(String[] args) {
        Parrot parrot = new Parrot("parrot");
        Lion lion = new Lion("lion");
        List<com.grt.solid.ocp.ex2.good.Animal> animals = new ArrayList<com.grt.solid.ocp.ex2.good.Animal>();
        animals.add(parrot);animals.add(lion);
        animals.stream().forEach(t-> t.sound());
    }
}

