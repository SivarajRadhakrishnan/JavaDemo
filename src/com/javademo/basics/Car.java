package com.javademo.basics;

import com.javademo.classes.Vehicle;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 30/11/20
 * Time: 12:25 PM
 * To change this template use File | Settings | File and Code Templates.
 */
public class Car extends Vehicle {

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }
}