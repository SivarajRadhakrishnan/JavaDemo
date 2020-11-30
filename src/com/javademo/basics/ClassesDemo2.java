package com.javademo.basics;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 30/11/20
 * Time: 12:25 PM
 * To change this template use File | Settings | File and Code Templates.
 */
public class ClassesDemo2 {
    public static void main(String[] args) {
        Car car = new Car();
//        car.make = "Suzuki";
//        car.model = "Wagonr";
//        car.color = "Gold";
//        car.fuelType = FuelType.PETROL;
//        car.capacity = 4;
//        car.engineCC = 1500;

        car.setMake("Suzuki");
        car.setModel("Wagonr");
        car.setColor("Gold");
        car.setFuelType(FuelType.PETROL);
        car.setCapacity(4);
        car.setEngineCC(1500);

        car.print();
    }
}