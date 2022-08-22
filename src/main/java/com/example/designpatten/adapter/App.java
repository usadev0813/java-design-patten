package com.example.designpatten.adapter;

import com.example.designpatten.adapter.security.LoginHandler;
import com.example.designpatten.adapter.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("usadev", "usadev");
        System.out.println(login);
    }
}
