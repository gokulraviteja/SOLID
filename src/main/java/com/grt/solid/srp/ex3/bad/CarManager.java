package com.grt.solid.srp.ex3.bad;

import java.util.Arrays;
import java.util.List;

public class CarManager
{
    // why to keep persistence logic in manager ?
    private List<Car> _carsDb = Arrays
            .asList(new Car("1",  "Volkswagen"),
                    new Car("2",  "Fiat"),
                    new Car("3",  "Renault"));

    public Car getFromDb(final String carId)
    {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public String getCarsNames()
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carsDb) {
            sb.append(car.getBrand());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }


}
