package com.example.designpatten.singleton;

public class SingletonTestMain {
    public static void main(String[] args) {
        Settings6 instance = Settings6.INSTANCE;
        Settings6 instance1 = Settings6.INSTANCE;

        System.out.println(instance == instance1);
    }
}
