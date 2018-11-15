package com.school.carmanufacturer;

import java.util.ArrayList;

public class S3 extends Car{

    private Integer price = 50000;
    private ArrayList<String> colors;
    private ArrayList<String> drives;

    public S3(){
        super("S3");
        construct();


    }
    @Override
    protected void construct(){
        //chose colors and stuff
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
}

