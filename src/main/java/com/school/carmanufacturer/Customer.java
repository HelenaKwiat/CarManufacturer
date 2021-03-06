package com.school.carmanufacturer;

import java.util.ArrayList;
/**
 * To hold details and methods related to Customer users
 */

public class Customer extends User{
    private String username;
    private String password;
    private ArrayList<Order> orders = new ArrayList<>();
    private static ArrayList<Customer> customers = new ArrayList<>();


    /**
     * To find customer in data
     * @param _username-customer username
     * @param _password-customer password
     *
     * @return - customer
     */
    public Customer findCustomer(String _username, String _password){
        Customer result;
        for(Customer customer : customers){
            if(_username.equals(customer.username) && _password.equals(customer.password)){
                result = customer;
                return result;
            }
        }
        System.out.println("Username or Password is Incorrect");
        return new Customer();
    }

    /**
     * to create new customer
     * @return - Customer
     */
    public Customer getNewCustomer(){
        System.out.println("Pick your Username");
        username = Menu.getScanner().nextLine();
        System.out.println("Pick your Password");
        password = Menu.getScanner().nextLine();
        customers.add(this);
        return this;

    }

    /**
     * View all orders of Customer
     */

    public void enumOrder(){

            System.out.println("Your Orders");
            for (Order order : orders) {
                System.out.println(order);
            }
    }

    public void setUsername(String _username){
        username = _username;
    }
    public void setPassword(String _password){
        password = _password;
    }
    public String getUsername(){return username;}
    public String getPassword(){return password;}

    public ArrayList<Order> getOrders() {
        return orders;
    }
}
