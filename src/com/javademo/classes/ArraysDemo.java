package com.javademo.classes;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 23/11/20
 * Time: 11:12 AM
 * To change this template use File | Settings | File and Code Templates.
 */
public class ArraysDemo {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car("Hyundai","Santro","Green","HatchBack","Petrol");
        cars[1] = new Car("Maruti","Suzuki","DarkRed","HatchBack","Petrol");
        cars[2] = new Car("Toyota","Etios","Ash","Sedan","Diesel");
        cars[3] = new Car("Ford","Ecosport","DarkGrey","HatchBack","Diesel");
        cars[4] = new Car("Tata","Nixon","Blue","HatchBack","Gas");

        for(int i=0; i<5; i++)
        {
            System.out.println("i=" + i);
            cars[i].print();
        }
    }
}