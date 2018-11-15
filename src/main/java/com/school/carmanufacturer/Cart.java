package com.school.carmanufacturer;

import java.util.ArrayList;

public class Cart {
    private Order order;
    private int total;

    public Cart(Order _order){
        order = _order;
    }
    @Override
    public String toString(){
        ArrayList<OrderCar> items = order.getOrder();
        StringBuilder string = new StringBuilder();
        string.append("--------------------CART-------------------\n");
        for(OrderCar item: items){
            string.append(items.indexOf(item)+1);
            string.append(") ");
            string.append( "MODEL: ").append(item.getOrderCar().getModel());
            //string.append(" QUANTITY: ");
            string.append(item.getQuantity());
            string.append(" PRICE PER UNIT: ");
            string.append(item.getOrderCar().getPrice());
            string.append(" Color: ");
            string.append(item.getOrderCar().getColor());
            string.append(" Drive: ");
            string.append(item.getOrderCar().getDrive());
            string.append("\n");
        }
        order.setOrderTotal(order.getOrder());
        string.append("Total: ").append( order.getOrderTotal());
        return string.toString();
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
