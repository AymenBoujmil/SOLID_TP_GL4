package com.directi.training.srp.MonTravail;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarDao implements ICarDao
{
    private List<Car> carsDb = Arrays
            .asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
                    new Car("3", "Megane", "Renault"));

    public Car findById(String carId)
    {
        for (Car car : carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public List<Car> findAll()
    {
        return new ArrayList<>(carsDb);
    }

}