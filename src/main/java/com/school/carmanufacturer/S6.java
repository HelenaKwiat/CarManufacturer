package com.school.carmanufacturer;

import java.util.ArrayList;
import java.util.Scanner;

public class S6 extends Car {
    private Integer price = 50000;
    private static ArrayList<String> colors = new ArrayList<>();
    private static ArrayList<String> drives = new ArrayList<>();
    private  Menu s6Colors = new Menu();
    private  Menu s6Drives = new Menu();

    static{
        colors.add("Blue");
        colors.add("Rust");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Red");
        drives.add("All Wheel");
        drives.add("Two Wheel");


    }


    public S6(){
        super("S6");
        //construct();
        createSubMenu();
    }

    @Override
    protected void construct(){
        //chose colors and stuff
        //System.out.println("construct");

    }

    public void createSubMenu(){


        for(String color: colors){
            s6Colors.add(new MenuOption(color) {
                @Override
                public void doAction() {
                    setColor(color);
                    s6Drives.question();
                }
            });
        }


        for(String drive: drives){
            s6Drives.add(new MenuOption(drive) {
                @Override
                public void doAction() {
                    setDrive(drive);

//                    String input;
//                    Scanner scanner = new Scanner(System.in);
//                    System.out.println("How Many Would you like?");
//                    input = scanner.nextLine();
//                    //System.out.println(input);
//                    setQuantity(Integer.parseInt(input));
//                    //s6Drives.setInput("Exit");
//                    scanner.close();
                }
            });
        }

    }

    public void setPrice(String _price){}

    public void setColors(ArrayList<String> _colors) {
        this.colors = colors;
    }

    public void setDrives(ArrayList<String> drives) {
        this.drives = drives;
    }

    @Override
    public Integer getPrice() {
        return price;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public ArrayList<String> getDrives() {
        return drives;
    }

    public Menu getS6Colors() {
        return s6Colors;
    }
}
