package com.school.carmanufacturer;

import com.school.carmanufacturer.Payment;

public class PayPal extends Payment {
    private String username;
    private String password;
    private int orderNumber;

    public PayPal(String _username, String _password, int _orderNumber){
        username = _username;
        password = _password;
        orderNumber = _orderNumber;
        setPaid(true);

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

    @Override
    public void setPaid(Boolean _paid) {
        super.setPaid(_paid);
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

    @Override
    public Boolean getPaid() {
        return super.getPaid();
    }
}
