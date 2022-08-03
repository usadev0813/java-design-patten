package com.example.designpatten.singleton;


/*
double checked locking 사용하기
(매우 많은 트래픽 발생시 if문안에 여러 쓰레드가 동시에 들어올 수 있는데
그럴 경우에만 synchronized하게 효율적으로 처리,이른 초기화와 달리 객체 사용시점에 인스턴스 생성 )
*/
public class Settings4 {

    private static volatile Settings4 instance;

    private Settings4() {}

    public static Settings4 getInstance() {
        if(instance == null) {
            synchronized (Settings4.class) {
                if(instance == null) {
                    instance = new Settings4();
                }
            }
        }
        return instance;
    }
}