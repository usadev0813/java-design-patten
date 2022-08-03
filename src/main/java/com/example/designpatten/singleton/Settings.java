package com.example.designpatten.singleton;

import java.io.Serializable;

public class Settings {

    private Settings() {}

    private static class settingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return settingsHolder.INSTANCE;
    }
}