package com.school.carmanufacturer;

/**
 * Abstract class to ask for user details
 */

public abstract class User {
    /**
     * To get login information from user
     * @return - instance of user
     */
    public User getCredentials(){
        System.out.println("Enter your Username");
        String _username = Menu.getScanner().nextLine();
        System.out.println("Enter your Password");
        String _password = Menu.getScanner().nextLine();
        return findCustomer(_username, _password);
    }

    protected abstract User findCustomer(String _userName, String _password);
}
