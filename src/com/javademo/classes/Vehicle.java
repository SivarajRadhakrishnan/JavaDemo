package com.javademo.classes;


import com.javademo.basics.FuelType;
import com.javademo.basics.VehicleType;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 11/11/20
 * Time: 11:42 AM
 * To change this template use File | Settings | File and Code Templates.
 */
public class Vehicle {
    protected String make;
    protected String model;
    protected String color;
    protected VehicleType type;
    protected FuelType fuelType;
    protected float price;
    protected int capacity;
    protected int engineCC;

    public Vehicle()
    {
    }

    public Vehicle(String mak, String model, String color, VehicleType type, FuelType fuelType)
    {
        make = mak;
        this.model = model;
        this.color = color;
        this.type = type;
        this.fuelType = fuelType;
    }

    public void print(){
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
        System.out.println("Vehicle.overrideMethod called..");
        System.out.println("-------------------------------");
    }
}