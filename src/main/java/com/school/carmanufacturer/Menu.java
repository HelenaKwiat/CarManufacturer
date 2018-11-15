package com.school.carmanufacturer;
import java.util.ArrayList;
import java.util.Scanner;



public class Menu {
    private ArrayList<MenuOption> menuOptions = new ArrayList<>();
    private String exit = "Exit";
    public Menu(){}
    private Scanner scanner = new Scanner(System.in);

    public void add(MenuOption option){
        this.menuOptions.add(option);
    }
    public void loop(){
        try(Scanner scanner = new Scanner(System.in)){
            while(true){
             question();
             //scanner.nextLine();
             //scanner = new Scanner(System.in);

            }
        }
    }
    public void question(){
            String input = "";
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
                    foundOption = true;
                    break;
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
        string.append("---------------------Main Menu-------------------\n");
        string.append("                 Choose an Option\n\n");
        for (MenuOption option: menuOptions){
            string.append(option.getOption()).append("\n");
        }
        string.append("Exit");
        return string.toString();

    }


}


