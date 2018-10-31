package com.school.carmanufacturer;

import java.util.ArrayList;

public class Manufacturer {
    private String username;
    private String password;
    private ArrayList<Order> orders;

    public Manufacturer(String _username, String _password){
        username = _username;
        password = _password;
    }

    public void setUsername(String _username){
        username = _username;
    }
    public void setPassword(String _password){
        password = _password;
    }
    public String getUsername(){return username;}
    public String getPassword(){return password;}
}
