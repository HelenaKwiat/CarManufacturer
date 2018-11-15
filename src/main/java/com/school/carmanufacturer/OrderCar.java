package com.school.carmanufacturer;

public class OrderCar {
    private Car car;
    private Integer quantity = 1;
    //private String color;
    private Integer price;
    private Order order;

    public OrderCar(Car _car, Integer _quantity, Order _order){
        car = _car;
        //quantity = _quantity;
        //color = _color;
        order = _order;
        //price = _orderCar.getPrice();
        order.addCar(this);
    }


    public void setOrderCar(Car _car){
        car = _car;
    }
    public void setQuantity(Integer _quantity){
        quantity = _quantity;
    }
//    public void setColor(String _color){
//        color = _color;
//    }
    public void setPrice(Integer _price){
        price = _price;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Car getOrderCar(){return car;}
    public Integer getQuantity(){return quantity;}
//    public String getColor(){return color;}
    public Order getOrder() { return order; }
}
