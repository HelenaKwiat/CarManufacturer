package com.school.carmanufacturer;

import java.util.ArrayList;

public class Cart {
    private Order order;
    private int total;

    public Cart(Order _order){
        order = _order;
    }
    public void displayCart(){
        ArrayList<OrderCar> items = order.getOrder();
        System.out.println("--------------------CART-------------------");
        for(OrderCar item: items){
            System.out.println(items.indexOf(item)+1 + ") " + "MODEL: " + item.getOrderCar().getModel() + " QUANTITY: " + item.getQuantity() + " PRICE PER UNIT: " + item.getOrderCar().getPrice());
        }
        order.setOrderTotal(order.getOrder());
        System.out.print("Total: " + order.getOrderTotal());
    }

    public void setItems(OrderCar addItem){}
    public void setTotal(ArrayList<OrderCar> items){
        total = 0;
        for(int i = 0; i< items.size(); i = i +1){
            //total = total + (items.get(i).getQuantity() * items.get(i).getprice);
        }
    }
    public Order getItems(){return order;}
    public Integer getTotal(){return total;}
}
