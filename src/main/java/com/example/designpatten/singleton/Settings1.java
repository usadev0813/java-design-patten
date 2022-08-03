package com.example.designpatten.singleton;


//가장 기초적인 싱글톤 멀티스레드 환경에 취약함
public class Settings1 {
    private static Settings1 instance;

    private Settings1() {}

    public static Settings1 getInstance() {
        if(instance == null) {
            instance = new Settings1();
        }
        return instance;
    }
}
