package com.school.carmanufacturer;

public abstract class User {

    public User getCredentials(){
        System.out.println("Enter your Username");
        String _username = Menu.getScanner().nextLine();
        System.out.println("Enter your Password");
        String _password = Menu.getScanner().nextLine();
        return findCustomer(_username, _password);
    }

    public abstract User findCustomer(String _userName, String _password);
}
