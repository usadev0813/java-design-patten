package com.example.designpatten.factory_method.after;

public class Client {

    public static void main(String[] args) {

        ShipFactory whiteShipFactory = new WhiteShipFactory();
        whiteShipFactory.orderShip("123", "123");
    }

}
