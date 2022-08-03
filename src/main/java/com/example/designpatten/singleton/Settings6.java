package com.example.designpatten.singleton;

//enum으로 싱글톤 패턴 구현시 리플렉션, 직렬화,역직렬화에 안전함
//하지만 즉시로딩이며, enum클래스 말고는 상속이 불가함
public enum Settings6 {
    INSTANCE;
}
