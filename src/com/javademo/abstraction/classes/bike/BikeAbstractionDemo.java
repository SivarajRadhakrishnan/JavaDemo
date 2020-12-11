package com.javademo.abstraction.classes.bike;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 11/12/20
 * Time: 12:48 PM
 * To change this template use File | Settings | File and Code Templates.
 */
public class BikeAbstractionDemo {
    public static void main(String[] args) {
        BikeDrive bikeDrive = new BikeDrive("Peter");
        System.out.println("Going to bank");
        System.out.println("--------------");
        bikeDrive.startBike();
        bikeDrive.accelarate();
        bikeDrive.driveBike();
        bikeDrive.decelerate();
        bikeDrive.stopBike();
        System.out.println("\nReturning from bank");
        System.out.println("---------------------");
        bikeDrive.startBike();
        bikeDrive.accelarate();
        bikeDrive.driveBike();
        bikeDrive.decelerate();
        bikeDrive.stopBike();
        bikeDrive.returnBike();

        BikeDrive bikeDrive2 = new BikeDrive("James");
        System.out.println("Going to Hospital");
        System.out.println("------------------");
        bikeDrive2.startBike();
        bikeDrive2.accelarate();
        bikeDrive2.driveBike();
        bikeDrive2.decelerate();
        bikeDrive2.stopBike();
        System.out.println("\nReturning from Hospital");
        System.out.println("--------------------------");
        bikeDrive2.startBike();
        bikeDrive2.accelarate();
        bikeDrive2.driveBike();
        bikeDrive2.decelerate();
        bikeDrive2.stopBike();
        bikeDrive2.returnBike();
    }
}