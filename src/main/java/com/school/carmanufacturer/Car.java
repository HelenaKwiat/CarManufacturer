package com.school.carmanufacturer;

import java.util.ArrayList;

/**
 * Methods to be implemented in cars as well as overarching details that encompass all cars
 */

public abstract class Car {
    private String model;
    private int price;
    private String color;
    private String drive;
    private int quantity = 1;
    private ArrayList<String> colors = new ArrayList<>();
    private ArrayList<String> drives = new ArrayList<>();
    private Menu colorMenu = new Menu();
    private Menu driveMenu = new Menu();
    private static ArrayList<Car> models = new ArrayList<>();

    static {
        models.add(new S6());
        models.add(new S3());
        models.add(new A4());
        models.add(new A5());
    }

    //TODO implement individual cars
    public Car(String _model) {
        model = _model;
    }

    /**
     * get input from user for how many they would like
     */
    public void getQuantityInput(){
        System.out.println("How Many Would you like?");
        int input = Integer.parseInt(Menu.getScanner().nextLine());
        setQuantity(input);
    }

    protected abstract Car construct();

    protected abstract int getPrice();

    protected abstract void createSubMenu();

    protected abstract void setColors();

//    public void setPrice(Integer price) {
//        this.price = price;
//    }
//
//    public Integer getPrice() {
//        return price;
//    }


    public void setColor(String _color) {
        color = _color;
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

    public ArrayList<String> getDrives() {
        return drives;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public Menu getColorMenu() {
        return colorMenu;
    }

    public static ArrayList<Car> getModels() {
        return models;
    }

    public Menu getDriveMenu() {
        return driveMenu;
    }
}


