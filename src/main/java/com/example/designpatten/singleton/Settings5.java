package com.example.designpatten.singleton;


/*
static inner 클래스 사용하기 (getInstance가 호출될때 SettingHolder가 로딩되며 스레딩 safe함) #권장되는 방법중 하나
하지만 리플렉션이나 직렬화(객체를 파일로저장), 역직렬화(파일을 객체로변환)시 싱글톤이 깨질 수 있음

직렬화, 역직렬화시엔 readResolve() 라는 메소드가 쓰이는데 이때 new Settings()를하여 싱글톤이 깨진다
- 해결방안 -> 싱글톤 클래스에 readResolve() 메소드를 재정의하여
             static inner 클래스 사용하기 방법의 getInstance()메소드를 사용하면 막을 수 있음
*/
public class Settings5 {

    private Settings5() {}

    private static class SettingHolder {
        private static final Settings5 INSTANCE = new Settings5();
    }

    public static Settings5 getInstance() {
        return SettingHolder.INSTANCE;
    }

    private Object readResolve() {
        return getInstance();
    }
}