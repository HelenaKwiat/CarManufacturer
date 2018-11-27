package com.school.carmanufacturer;

import com.sun.tools.corba.se.idl.constExpr.Or;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

/**
 * MainClass to act as a driver and set up Menus
 */

@SpringBootApplication
public class CarManufacturerApplication {
    //TODO implement whole main menu/user interface
    private Menu paymentMenu = new Menu();
    private Menu menu = new Menu();
    private Menu carMenu = new Menu();
    private Menu loginMenu = new Menu();
    private Menu manufacturerMenu = new Menu();
    private User user;
    private Order order;
    private int orderNumber = 0;
    private ArrayList<Car> cars = Car.getModels();


    /**
     * Create Static Payment Menu
     */
    public void createNewPaymentMenu(){
        for(Payment payment : Payment.getPaymentTypes()){
            paymentMenu.add(new MenuOption(payment.toString()) {
                @Override
                public void doAction() {
                    payment.construct(order);
                }
            });
        }

    }

    /**
     * Create Static Car Menu
     */
    public void createNewCarMenu(){
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

    /**
     * Create Static Main menu
     */

    public void createMenu() {
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

    /**
     * Create static Login Menu
     */
    public void createLoginMenu() {
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

    /**
     * Create new order, called every time previous order is paid for and browse cars is selected
     */
    public void createOrder(){
        if (user instanceof Customer) {
            Customer customer = (Customer) user;
            orderNumber = orderNumber + 1;
            order = new Order(customer, orderNumber );
        }
    }

    /**
     * 'Creates static Manufacturer Menu
     */
    public void createManufacturerMenu(){
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

    /**
     * Driver
     * @param args-convention
     */

    public static void main(String[] args) {
        SpringApplication.run(CarManufacturerApplication.class, args);
        CarManufacturerApplication main = new CarManufacturerApplication();
        main.createLoginMenu();
        main.createMenu();
        main.createNewCarMenu();
        main.createNewPaymentMenu();
        main.createManufacturerMenu();
        main.loginMenu.loop();

    }

}

