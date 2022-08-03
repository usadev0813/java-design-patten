package com.example.designpatten.singleton;


//가장 기초적인 싱글톤 멀티스레드 환경에 취약함
public class Settings3 {

    private static final Settings3 INSTANCE = new Settings3();

    private Settings3() {}

    public static Settings3 getInstance() {
        return INSTANCE;
    }
}