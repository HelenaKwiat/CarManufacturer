package com.school.carmanufacturer;
import java.util.ArrayList;
import java.util.Scanner;



public class Menu {
    private ArrayList<MenuOption> menuOptions = new ArrayList<>();
    private String exit = "Exit";
    private static Scanner scanner = new Scanner(System.in);
    private String input = " ";

    public void add(MenuOption option){
        this.menuOptions.add(option);
    }
    public void loop(){
            //scanner.useDelimiter("\\n");
            while(true){
                //System.out.println("I made it to the loop");
                    //System.out.println("exiting");
                question();
                if(input.equals(exit)){
                    //input = scanner.nextLine();
                    return;
                }
             //scanner.nextLine();
             //scanner = new Scanner(System.in);

            }

    }
    public void question() {
            System.out.println(this);
        //System.out.println(input);

            input = scanner.nextLine();
            if (input.equals(exit)) {
                //System.out.println("exiting");
                return;
            }
            boolean foundOption = false;
            for (MenuOption option : menuOptions) {
                if (option.getOption().equals(input)) {
                    option.doAction();
                    //System.out.println();
                    foundOption = true;
                    return;
                }
            }
            //scanner.nextLine();
            if (!foundOption) {
                System.out.println("NOT A VALID OPTION, PLEASE CHOOSE ANOTHER");
                question();
            }


    }


    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        string.append("---------------------Menu-------------------\n");
        string.append("               Choose an Option\n\n");
        for (MenuOption option: menuOptions){
            string.append(option.getOption()).append("\n");
        }
        string.append("Exit");
        return string.toString();

    }

    public static Scanner getScanner() {
        return scanner;
    }
}


