package com.example.designpatten.factoryMethod.after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "keesun@mail.com");
        client.print(new BlackShipFactory(), "whiteship", "keesun@mail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
