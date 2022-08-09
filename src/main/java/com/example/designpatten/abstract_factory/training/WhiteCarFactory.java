package com.example.designpatten.abstract_factory.training;

public class WhiteCarFactory implements DefaultCarFactory {

    private CarPartsFactory carPartsFactory;

    public WhiteCarFactory(CarPartsFactory carPartsFactory) {
        this.carPartsFactory = carPartsFactory;
    }

    @Override
    public Car createCar() {
        Car car = new Car();
        car.setHandle(new WhiteHandle());
        car.setWheel(new WhiteWheel());
        return car;
    }
}
