package com.javademo.classes;

import com.javademo.basics.FuelType;
import com.javademo.basics.VehicleType;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 23/11/20
 * Time: 11:12 AM
 * To change this template use File | Settings | File and Code Templates.
 */
public class ArraysDemo {
    public static void main(String[] args) {
        Vehicle[] cars = new Vehicle[5];
        cars[0] = new Vehicle("Hyundai","Santro","Green", VehicleType.CAR, FuelType.PETROL);
        cars[1] = new Vehicle("Maruti","Suzuki","DarkRed", VehicleType.CAR,FuelType.PETROL);
        cars[2] = new Vehicle("Toyota","Etios","Ash", VehicleType.CAR,FuelType.DIESEL);
        cars[3] = new Vehicle("Ford","Ecosport","DarkGrey", VehicleType.CAR,FuelType.DIESEL);
        cars[4] = new Vehicle("Tata","Nixon","Blue", VehicleType.CAR,FuelType.GAS);

        for(int i=0; i<5; i++)
        {
            System.out.println("i=" + i);
            cars[i].print();
        }
    }
}