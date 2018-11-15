package com.school.carmanufacturer;

import java.util.ArrayList;

public abstract class Car {
    private String model;
    private Integer price;
    private String color;
    private String drive;
    private int quantity;

    //TODO implement individual cars
    public Car(String _model) {
        model = _model;
    }

    protected abstract void construct();

    protected abstract Integer getPrice();

    public void setModel(String _model) {
        model = _model;
    }

//    public void setPrice(Integer price) {
//        this.price = price;
//    }
//
//    public Integer getPrice() {
//        return price;
//    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getDrive() {
        return drive;
    }

    public int getQuantity() {
        return quantity;
    }
}


