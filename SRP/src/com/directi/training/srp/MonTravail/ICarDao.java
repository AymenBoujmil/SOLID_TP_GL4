package com.directi.training.srp.MonTravail;

import java.util.List;

public interface ICarDao {
    public Car findById(String carId);
    public List<Car> findAll();
}
