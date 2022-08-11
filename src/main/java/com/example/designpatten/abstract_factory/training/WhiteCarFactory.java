package com.example.designpatten.abstract_factory.training;

public class WhiteCarFactory implements DefaultCarFactory {

    private CarPartsFactory carPartsFactory;

    public WhiteCarFactory(CarPartsFactory carPartsFactory) {
        this.carPartsFactory = carPartsFactory;
    }

    @Override
    public Car createCar() {
        Car car = new Car();
        car.setHandle(carPartsFactory.createHandle());
        car.setWheel(carPartsFactory.createWheel());
        return car;
    }
}
