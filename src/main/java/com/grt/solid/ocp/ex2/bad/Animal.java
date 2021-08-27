package com.grt.solid.ocp.ex2.bad;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public class Animal {
    private String name;

    public void sound(Animal animal) {

        if (animal.getName().equals("lion")) {
            System.out.println("Lion Sound");
        } else if (animal.getName().equals("monkey")) {
            System.out.println("Monkey Sound");
        } else if (animal.getName().equals("parrot")) {
            System.out.println("Parrot Sound");
        }
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal("lion");
        Animal animal2 = new Animal("monkey");
        Animal animal3 = new Animal("parrot");

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(animal1);animals.add(animal2);animals.add(animal3);
        animals.stream().forEach(t-> t.sound(t));

    }
}

