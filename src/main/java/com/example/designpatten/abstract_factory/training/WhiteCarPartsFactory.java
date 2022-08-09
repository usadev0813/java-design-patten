package com.example.designpatten.abstract_factory.training;

public class WhiteCarPartsFactory implements CarPartsFactory {
    @Override
    public Handle createHandle() {
        return new WhiteHandle();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
