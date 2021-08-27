package com.grt.solid.srp.ex3.good;

import java.util.Arrays;
import java.util.List;

public class CarDao {

    private List<Car> carsDb = Arrays
            .asList(new Car("1",  "Volkswagen"),
                    new Car("2",  "Fiat"),
                    new Car("3",  "Renault"));

    public Car getCarById(String carId){
        for(Car car : carsDb){
            if(car.getId().equals(carId)){
                return car;
            }
        }
        return null;
    }

    public List<Car> getAllCars(){
        return carsDb;
    }



}
