package com.directi.training.srp.MonTravail;

public class CarManager
{
    private final ICarDao carDao;
    private final ICarFormatter carFormatter;
    private final ICarRater carRater;

    public CarManager(ICarDao carDao, ICarFormatter carFormatter, ICarRater carRater)
    {
        this.carDao = carDao;
        this.carFormatter = carFormatter;
        this.carRater = carRater;
    }

    public Car getCarById(final String carId)
    {
        return carDao.findById(carId);
    }

    public String getCarsNames()
    {
        return carFormatter.getCarsNames(carDao.findAll());
    }

    public Car getBestCar()
    {
        return carRater.getBestCar(carDao.findAll());
    }
}