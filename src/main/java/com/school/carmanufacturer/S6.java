package com.school.carmanufacturer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class S6 extends Car {
    private Integer price = 100000;
    private ArrayList<String> colors = new ArrayList<>();
    private ArrayList<String> drives = new ArrayList<>();







    public S6(){
        super("S6");
    }

    public void setColors(){
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Black");
        colors.add("Green");
        colors.add("Red");
        drives.add("All Wheel");
        drives.add("Two Wheel");

    }
    public void createSubMenu(){


        for(String color: colors){
            getColorMenu().add(new MenuOption(color) {
                @Override
                public void doAction() {
                    setColor(color);
                    getDriveMenu().question();
                }
            });
        }


        for(String drive: drives){
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
      return new S6();

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
        return "S6";
    }
}
