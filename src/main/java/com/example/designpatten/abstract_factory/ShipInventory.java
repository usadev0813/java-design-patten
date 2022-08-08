package com.example.designpatten.abstract_factory;

import com.example.designpatten.factory_method.after.Ship;
import com.example.designpatten.factory_method.after.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();

//        new ShipFactory.orderShip(ship);
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());

    }
}
