package com.school.carmanufacturer;

import com.sun.tools.corba.se.idl.constExpr.Or;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class CarManufacturerApplication {
    //TODO implement whole main menu/user interface
    public static void main(String[] args) {
        SpringApplication.run(CarManufacturerApplication.class, args);

          Customer customer = new Customer("hkwiat", "password");
//
//        Order order = new Order(customer, 0);
//
//        OrderCar orderCar = new OrderCar(new S6(), 3, order);
//        order.addCar(orderCar);
//        OrderCar orderCar1 = new OrderCar(new S6(), 4, order);
//        order.addCar(orderCar1);

//        System.out.println(new Cart(order));
//
        Menu menu = new Menu();
        Menu carMenu = new Menu();
        new S6().createSubMenu();
        Order order = new Order(customer, 0);
        carMenu.add(new MenuOption("S6") {
          @Override
          public void doAction() {
                //System.out.println("here");
                S6 s6 = new S6();
                //System.out.println("there");
                s6.getS6Colors().question();
                //System.out.println("there");
                new OrderCar(s6, s6.getQuantity(), order);
          }
      });

      carMenu.add(new MenuOption("S3") {
          @Override
          public void doAction() {
              new S3();
          }
      });

        carMenu.add(new MenuOption("A4") {
            @Override
            public void doAction() {
                new A4();
            }
        });

        carMenu.add(new MenuOption("A5") {
            @Override
            public void doAction() {
                new A5();

            }
        });


       menu.add(new MenuOption("Browse Cars") {
           @Override
           public void doAction() {
               carMenu.question();
           }
       });

       menu.add(new MenuOption("View Cart") {
           @Override
           public void doAction() {
                System.out.println(new Cart(order));
           }
       });

       menu.add(new MenuOption("Pay") {
           @Override
           public void doAction() {

           }
       });

       menu.add(new MenuOption("Have an order? Track Status") {
           @Override
           public void doAction() {

           }
       });

       menu.loop();

    }
}
