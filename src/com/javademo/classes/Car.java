package com.javademo.classes;


/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 11/11/20
 * Time: 11:42 AM
 * To change this template use File | Settings | File and Code Templates.
 */
public class Car {
    String make;
    String model;
    String color;
    String type;
    String fuelType;
    float price;
    int capacity;
    int engineCC;

    public Car(String mak, String model, String color, String type, String fuelType)
    {
        make = mak;
        this.model = model;
        this.color = color;
        this.type = type;
        this.fuelType = fuelType;
    }

    public void print(){
        System.out.println("---------------");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("FuelType: " + fuelType);
        System.out.println("---------------");
    }
}