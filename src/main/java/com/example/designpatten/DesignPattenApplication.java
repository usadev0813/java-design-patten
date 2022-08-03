package com.example.designpatten;

import com.example.designpatten.singleton.Settings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.h2.H2ConsoleProperties;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DesignPattenApplication {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings settings = Settings.getInstance();
        
    }

}
