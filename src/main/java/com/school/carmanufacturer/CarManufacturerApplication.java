package com.school.carmanufacturer;

import com.sun.tools.corba.se.idl.constExpr.Or;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class CarManufacturerApplication {
    //TODO implement whole main menu/user interface
    private static Menu paymentMenu = new Menu();
    private static Menu menu = new Menu();
    private static Menu carMenu = new Menu();
    private static Menu loginMenu = new Menu();
    private static Menu manufacturerMenu = new Menu();
    private static User user;
    private static Order order;
    private static int orderNumber = 0;
    private static ArrayList<Car> cars = Car.getModels();


    public static void createNewPaymentMenu(){
        for(Payment payment : Payment.getPaymentTypes()){
            paymentMenu.add(new MenuOption(payment.toString()) {
                @Override
                public void doAction() {
                    payment.construct(order);
                }
            });
        }

    }

    public static void createNewCarMenu(){
        for(Car car : cars){
            carMenu.add(new MenuOption(car.toString()) {
                @Override
                public void doAction() {
                    Car newCar = car.construct();
                    newCar.setColors();
                    newCar.createSubMenu();
                    newCar.getColorMenu().question();
                    order.getOrder().add(newCar);

                }
            });
        }
    }

    public static void createMenu() {
        menu.add(new MenuOption("Browse Cars") {
            @Override
            public void doAction() {
                if(order.getProgresss().equals("Paid")){
                    createOrder();
                    carMenu.question();
                }
                else {
                    carMenu.question();
                }
            }
        });

        menu.add(new MenuOption("View Cart") {
            @Override
            public void doAction() {
                System.out.println(order);
            }
        });

        menu.add(new MenuOption("Pay") {
            @Override
            public void doAction() {
                System.out.println(order);
                paymentMenu.question();

            }
        });

        menu.add(new MenuOption("View Order Status") {
            @Override
            public void doAction() {
                //System.out.println(order.getProgresss());
                Customer customer = (Customer) user;
                if(customer.getOrders().size() == 0){
                    System.out.println("Order Not Yet Placed");
                }
                else {
                    customer.enumOrder();
                    order.getOrderStatus();
                }
            }
        });

    }

    public static void createLoginMenu() {
        loginMenu.add(new MenuOption("Customer Sign Up") {
            @Override
            public void doAction() {
                user = new Customer().getNewCustomer();
                createOrder();
                menu.loop();
            }
        });
        loginMenu.add(new MenuOption("Customer Login") {
            @Override
            public void doAction() {
                user = new Customer().getCredentials();
                createOrder();
                menu.loop();
            }
        });

        loginMenu.add(new MenuOption("Manufacturer Login") {
            @Override
            public void doAction() {
                Manufacturer man = new Manufacturer();
                man.setUsername("h");
                man.setPassword("h");
                Manufacturer.getManufacturers().add(man);
                user = new Manufacturer().getCredentials();
                manufacturerMenu.loop();
            }
        });


    }

    public static void createOrder(){
        if (user instanceof Customer) {
            Customer customer = (Customer) user;
            orderNumber = orderNumber + 1;
            order = new Order(customer, orderNumber );
        }
    }

    public static void createManufacturerMenu(){
        manufacturerMenu.add(new MenuOption("Update Order Status") {
            @Override
            public void doAction() {
                Manufacturer man = (Manufacturer) user;
                man.getOrderUpdateInput();
            }
        });

        manufacturerMenu.add(new MenuOption("Delete Order") {
            @Override
            public void doAction() {
                Manufacturer man = (Manufacturer) user;
                man.getOrderDeletionInput();
            }
        });
    }

    public static void main(String[] args) {
        SpringApplication.run(CarManufacturerApplication.class, args);
        createLoginMenu();
        createMenu();
        createNewCarMenu();
        createNewPaymentMenu();
        createManufacturerMenu();
        loginMenu.loop();

    }

}

