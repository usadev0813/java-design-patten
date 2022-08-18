package com.example.designpatten.adapter.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);
}
