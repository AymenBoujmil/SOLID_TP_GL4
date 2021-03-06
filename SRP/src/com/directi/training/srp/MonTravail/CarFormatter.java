package com.directi.training.srp.MonTravail;

import java.util.List;

public class CarFormatter implements ICarFormatter
{


    public String getCarName(Car car){
        StringBuilder sb = new StringBuilder();
        sb.append(car.getBrand());
        sb.append(" ");
        sb.append(car.getModel());
        return sb.toString();
    }
    public String getCarsNames(List<Car> cars)
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(this.getCarName(car));
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}