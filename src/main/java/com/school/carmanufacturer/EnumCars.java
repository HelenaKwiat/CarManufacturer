package com.school.carmanufacturer;

import java.util.ArrayList;

public class EnumCars {
    private static ArrayList<String> cars = new ArrayList<String>();

    public static void addCar(String _model){
        cars.add(_model);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for(String car: cars){
            string.append(car);
            string.append("\n");
        }
        return string.toString();
    }

}

