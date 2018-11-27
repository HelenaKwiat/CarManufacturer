package com.school.carmanufacturer;

import java.util.ArrayList;

public class Order {
    private Customer customer;
    private ArrayList<Car> order = new ArrayList<Car>();
    private int orderTotal;
    private String progresss = "Order Not Yet Placed";
    private int orderNumber;
    private static ArrayList<Order> orders = new ArrayList<>();

    Order(Customer _customer, int _orderNumber){
        customer = _customer;
        orderNumber = _orderNumber;
        orders.add(this);
        //order = _order;
    }

    public void addCar(Car _car){
        order.add(_car);
    }

    public void setCustomer(Customer _customer){
        customer = _customer;
    }
    public void setOrder(ArrayList<Car> _car){
        order = _car;
    }
    public void setOrderTotal(){
        orderTotal = 0;
        for(Integer i = 0; i < order.size(); i = i+1 ){
            orderTotal = orderTotal + (order.get(i).getPrice()*order.get(i).getQuantity());

        }
    }

    public void getOrderStatus(){
        System.out.println("Enter the Order Number");
        int input = Integer.parseInt(Menu.getScanner().nextLine());
        for(Order order : orders){
            if(order.getOrderNumber() == input){
                System.out.println(order.getProgresss());
                return;
            }
        }
        System.out.println("This Order Does Not Exist ");

    }

    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        string.append("--------------------CART-------------------\n");
        for(Car item: order){
            string.append(order.indexOf(item)+1);
            string.append(") ");
            string.append( "MODEL: ").append(item.getModel());
            //string.append(" QUANTITY: ");
            //string.append(item.getQuantity());
            string.append(" PRICE PER UNIT: ");
            string.append(item.getPrice());
            string.append(" Color: ");
            string.append(item.getColor());
            string.append(" Drive: ");
            string.append(item.getDrive());
            string.append("\n");
        }
        setOrderTotal();
        string.append("Total: ").append(orderTotal);
        string.append("\n");
        string.append("Order Number: ").append(orderNumber);
        return string.toString();
    }

    public void setProgresss(String _progress){
        progresss = _progress;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Customer getCustomer(){return customer;}
    public ArrayList<Car> getOrder(){ return order;}
    public Integer getOrderTotal(){return orderTotal;}
    public String getProgresss(){return progresss;}

    public Integer getOrderNumber() { return orderNumber; }

    public static ArrayList<Order> getOrders() {
        return orders;
    }
}
