package com.example.designpatten.abstract_factory.sample;

import com.example.designpatten.factory_method.after.DefaultShipFactory;
import com.example.designpatten.factory_method.after.Ship;
import com.example.designpatten.factory_method.after.WhiteShip;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
