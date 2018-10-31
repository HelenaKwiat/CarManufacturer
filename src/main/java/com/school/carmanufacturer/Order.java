package com.school.carmanufacturer;

import java.util.ArrayList;

public class Order {
    private Customer customer;
    private ArrayList<OrderCar> order = new ArrayList<OrderCar>();
    private Integer orderTotal;
    private String progresss;
    private Integer orderNumber;

    Order(Customer _customer, Integer _orderNumber){
        customer = _customer;
        orderNumber = _orderNumber;
        //order = _order;
    }

    public void addCar(OrderCar _orderCar){
        order.add(order.size() ,_orderCar);
    }

    public void setCustomer(Customer _customer){
        customer = _customer;
    }
    public void setOrder(ArrayList<OrderCar> _order){
        order = _order;
    }
    public void setOrderTotal(ArrayList<OrderCar> order){
        orderTotal = 0;
        for(Integer i = 0; i < order.size(); i = i+1 ){
            orderTotal = orderTotal + (order.get(i).getOrderCar().getPrice()*order.get(i).getQuantity());

        }
    }
    public void setProgresss(String _progress){
        progresss = _progress;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Customer getCustomer(){return customer;}
    public ArrayList<OrderCar> getOrder(){ return order;}
    public Integer getOrderTotal(){return orderTotal;}
    public String getProgresss(){return progresss;}

    public Integer getOrderNumber() { return orderNumber; }
}
