package com.example.designpatten.factoryMethod.java;

import com.example.designpatten.factoryMethod.after.BlackShip;
import com.example.designpatten.factoryMethod.after.WhiteShip;

public class SimpleFactory {

    public Object createProduct(String name) {
        if(name.equals("whiteship")) {
            return new WhiteShip();
        } else if (name.equals("blackship")) {
            return new BlackShip();
        }

        throw new IllegalArgumentException();
    }
}
