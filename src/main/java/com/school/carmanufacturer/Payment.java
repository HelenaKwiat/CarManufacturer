package com.school.carmanufacturer;

import java.util.ArrayList;

public abstract class Payment {
    private static ArrayList<Payment> paymentTypes = new ArrayList<>();
    private Boolean paid;
    private Order order;

    static{
        paymentTypes.add(new PayPal());
        paymentTypes.add(new CreditCard());
    }

    //TODO implements individual payment classes

    protected abstract void construct(Order order);

    public void setPaid(Boolean _paid) {
        System.out.println("Your Order had been Placed!");
        getOrder().setProgresss("Paid");
    }
    protected abstract void getCredentials();

    public Boolean getPaid() {
        return paid;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public static ArrayList<Payment> getPaymentTypes() {
        return paymentTypes;
    }
}
