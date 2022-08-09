package com.example.designpatten.abstract_factory.training;

public class Client {
    public static void main(String[] args) {
        DefaultCarFactory car = new WhiteCarFactory(new WhiteCarPartsFactory());
        car.createCar();
    }
}
