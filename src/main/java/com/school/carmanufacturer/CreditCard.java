package com.school.carmanufacturer;

import com.school.carmanufacturer.Payment;

public class CreditCard extends Payment {
    private int creditCardNumber;
    private String billingAddress;
    private int cvc;
    private int orderNumber;

    public void construct(Order _order) {
        setOrder(_order);
        getCredentials();
        setPaid(true);
        getOrder().getCustomer().getOrders().add(getOrder());

    }


    public void getCredentials(){
        System.out.println("Enter Your Credit Card Number");
        setCreditCardNumber(Integer.parseInt(Menu.getScanner().nextLine()));
        System.out.println("Enter your billing address");
        setBillingAddress(Menu.getScanner().nextLine());
        System.out.println("Enter your CVC");
        setCvc(Integer.parseInt(Menu.getScanner().nextLine()));
    }
    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    @Override
    public String toString() {
        return "Credit Card";
    }
}
