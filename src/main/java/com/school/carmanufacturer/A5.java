package com.school.carmanufacturer;

import java.util.ArrayList;

public class A5 extends Car {
    private Integer price = 40000;
    private ArrayList<String> colors = new ArrayList<>();
    private ArrayList<String> drives = new ArrayList<>();



    public A5(){
        super("A5");
        //construct();

    }

    public void setColors(){
        colors.add("Blue");
        colors.add("Violet");
        colors.add("Black");
        colors.add("Yellow");
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
        return new A5();
    }

    public void setPrice(String _price){}



    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public ArrayList<String> getDrives() {
        return drives;
    }

    @Override
    public ArrayList<String> getColors() {
        return colors;
    }

    @Override
    public String toString() {
        return "A5";
    }
}
