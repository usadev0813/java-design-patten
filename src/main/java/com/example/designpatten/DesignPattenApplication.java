package com.example.designpatten;

import com.example.designpatten.singleton.Settings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.h2.H2ConsoleProperties;

public class DesignPattenApplication {
    public static void main(String[] args) {
        Settings instance = Settings.getInstance();
        Settings instance1 = Settings.getInstance();

        System.out.println(instance == instance1);
    }

}
