package com.javademo.classes;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 30/11/20
 * Time: 12:11 PM
 * To change this template use File | Settings | File and Code Templates.
 */
public class Car extends Vehicle {

    public void printCar(){
        System.out.println("Vehicle: " + make + " " + model);
        System.out.println("--------------------------");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("FuelType: " + fuelType);
        System.out.println("Price: " + price);
        System.out.println("Capacity: " + capacity);
        System.out.println("EngineCC: " + engineCC);
        System.out.println();
    }

    public void overrideMethod(){
        System.out.println("-------------------------------");
        System.out.println("Car.overrideMethod called..");
        System.out.println("-------------------------------");
    }
}