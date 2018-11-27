package com.school.carmanufacturer;

import com.school.carmanufacturer.Payment;

/**
 * To Hold details of individual payment methods
 */

public class PayPal extends Payment {
    private String username;
    private String password;
    private int orderNumber;

   public void construct(Order _order) {
        setOrder(_order);
        getCredentials();
        setPaid(true);
        getOrder().getCustomer().getOrders().add(getOrder());

    }




    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public int getOrderNumber() {
        return orderNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void getCredentials(){
        System.out.println("Enter Your PayPal UserName");
        setUsername(Menu.getScanner().nextLine());
        System.out.println("Enter Your PayPal Password");
        setPassword(Menu.getScanner().nextLine());
    }

    @Override
    public Boolean getPaid() {
        return super.getPaid();
    }

    @Override
    public String toString() {
        return "PayPal";
    }
}
