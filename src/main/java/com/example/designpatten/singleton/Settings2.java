package com.example.designpatten.singleton;


// synchronized 키워드 사용하기 (가장 간편한 방법이지만 성능상에 불이득이 생길 수 있음)
public class Settings2 {

    private static Settings2 instance;

    private Settings2() {}

    public static synchronized Settings2 getInstance() {
        if(instance == null) {
            instance = new Settings2();
        }
        return instance;
    }
}