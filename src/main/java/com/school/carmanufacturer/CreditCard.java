package com.school.carmanufacturer;

import com.school.carmanufacturer.Payment;

public class CreditCard extends Payment {
    private int creditCardNumber;
    private String billingAddress;
    private int cvc;
    private int orderNumber;

    public CreditCard(int _creditCardNumber, String _billingAddress, int _cvc, int _orderNumber){
        creditCardNumber = _creditCardNumber;
        billingAddress = _billingAddress;
        cvc = _cvc;
        orderNumber = _orderNumber;
        setPaid(true);
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

    @Override
    public void setPaid(Boolean _paid) {
        super.setPaid(_paid);
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
    public Boolean getPaid() {
        return super.getPaid();
    }
}
