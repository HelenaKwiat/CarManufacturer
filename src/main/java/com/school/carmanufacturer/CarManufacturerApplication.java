package com.school.carmanufacturer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarManufacturerApplication {
    //TODO implement driver
    public static void main(String[] args) {
        SpringApplication.run(CarManufacturerApplication.class, args);

        Customer customer = new Customer("hkwiat", "password");

        Order order = new Order(customer, 0);

        OrderCar orderCar = new OrderCar(new S6(), 3, order);
        order.addCar(orderCar);
        OrderCar orderCar1 = new OrderCar(new S6(), 4, order);
        order.addCar(orderCar1);

        new Cart(order).displayCart();

    }
}
