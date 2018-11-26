package com.school.carmanufacturer;

import java.util.ArrayList;

public class Manufacturer extends User{
    //TODO implement progress updates for manufacturers
    private String username;
    private String password;
    private static ArrayList<Manufacturer> manufacturers = new ArrayList<Manufacturer>();



    public Manufacturer findCustomer(String _username, String _password){
        Manufacturer result;
        for(Manufacturer manufacturer : manufacturers){
            if(_username.equals(manufacturer.username) && _password.equals(manufacturer.password)){
                result = manufacturer;
                return result;
            }
        }
        System.out.println("Username or Password is Incorrect");
        return new Manufacturer();
    }

    public void updateOrder(int _orderNumber, String status){
        for(Order order : Order.getOrders()){
            if(order.getOrderNumber() == (_orderNumber)){
                Order result = order;
                result.setProgresss(status);
                break;
            }
        }
    }

    public void deleteOrder(int _orderNumbeer){
        for(Order order : Order.getOrders()){
            if(order.getOrderNumber() == _orderNumbeer){
                Order.getOrders().remove(order);
                break;
            }
        }
        System.out.println("Order Deleted!");
    }

    public void getOrderUpdateInput(){
        System.out.println("Enter the Order you Would like to update");
        int input = Integer.parseInt(Menu.getScanner().nextLine());
        System.out.println("Enter the status you would like to update the order to");
        String status = Menu.getScanner().nextLine();
        updateOrder(input, status);
    }

    public void getOrderDeletionInput(){
        System.out.println("Enter the Order you Would like to update");
        int input = Integer.parseInt(Menu.getScanner().nextLine());
        deleteOrder(input);
    }


    public void setUsername(String _username){
        username = _username;
    }
    public void setPassword(String _password){
        password = _password;
    }
    public String getUsername(){return username;}
    public String getPassword(){return password;}

    public static void setManufacturers(ArrayList<Manufacturer> manufacturers) {
        Manufacturer.manufacturers = manufacturers;
    }

    public static ArrayList<Manufacturer> getManufacturers() {
        return manufacturers;
    }
}
