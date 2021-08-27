package com.grt.solid.srp.ex3.good;

import java.util.List;

public class CarManager
{
    CarDao carDao;

    public CarManager(CarDao carDao ){
        carDao = new CarDao();
    }

    public Car getFromDb(final String carId) {
        return carDao.getCarById(carId);
    }

    public List<Car> getCarsNames() {
        return carDao.getAllCars();
    }


}
