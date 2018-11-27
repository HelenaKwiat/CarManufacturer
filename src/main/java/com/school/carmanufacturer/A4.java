package com.school.carmanufacturer;

import java.util.ArrayList;

public class A4 extends Car{
    private Integer price = 70000;
    private ArrayList<String> colors = new ArrayList<>();
    private ArrayList<String> drives = new ArrayList<>();


    public A4(){
        super("A4");
        //construct();
    }

    public void setColors(){
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Black");
        colors.add("Navy");
        colors.add("Red");
        drives.add("All Wheel");
        drives.add("Two Wheel");

    }

    public void createSubMenu(){


        for(String color: getColors()){
            getColorMenu().add(new MenuOption(color) {
                @Override
                public void doAction() {
                    setColor(color);
                    getDriveMenu().question();
                }
            });
        }


        for(String drive: getDrives()){
            getDriveMenu().add(new MenuOption(drive) {
                @Override
                public void doAction() {
                    setDrive(drive);

                    getQuantityInput();


                }
            });
        }

    }

    @Override
    protected Car construct(){
        return new A4();
    }

    public void setPrice(String _price){}


    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public ArrayList<String> getColors() {
        return colors;
    }

    @Override
    public ArrayList<String> getDrives() {
        return drives;
    }

    @Override
    public String toString() {
        return "A4";
    }
}
