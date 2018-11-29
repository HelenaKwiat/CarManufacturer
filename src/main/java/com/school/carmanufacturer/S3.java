package com.school.carmanufacturer;

import java.util.ArrayList;
/**
 * To Hold details of individual cars
 */
public class S3 extends Car{

    private ArrayList<String> colors = new ArrayList<>();
    private ArrayList<String> drives = new ArrayList<>();

    private Integer price = 50000;









    public S3(){
        super("S3");
        //construct();


    }
    /**
     * Adds colors of S3 to colors list to instantiate Menu
     */
    public void setColors(){
        //System.out.println("adding colors");
        colors.add("Blue");
        colors.add("Magenta");
        colors.add("Black");
        colors.add("Green");
        colors.add("Red");
        drives.add("All Wheel");
        drives.add("Two Wheel");
    }
    /**
     * Creates menus to be launched after entering into S3 based on individual colors and drives
     */
    public void createSubMenu(){


        for(String color: getColors()){
            //System.out.println("color added");
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
        return new S3();
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
        return "S3";
    }
}

