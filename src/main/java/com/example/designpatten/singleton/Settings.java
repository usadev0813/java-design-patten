package com.example.designpatten.singleton;

public class Settings {

    private Settings() {}

    private static class SettingHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingHolder.INSTANCE;
    }
}
