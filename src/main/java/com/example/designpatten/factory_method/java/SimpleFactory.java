package com.example.designpatten.factory_method.java;

import com.example.designpatten.factory_method.after.BlackShip;
import com.example.designpatten.factory_method.after.WhiteShip;

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
