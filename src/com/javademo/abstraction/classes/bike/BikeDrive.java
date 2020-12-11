package com.javademo.abstraction.classes.bike;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 11/12/20
 * Time: 12:48 PM
 * To change this template use File | Settings | File and Code Templates.
 */
public class BikeDrive {
    private Bike bike;

    public BikeDrive(String neighbour){
        System.out.println("\n\nGetting " + neighbour + "'s bike");
        this.bike = Neighbour.getBike(neighbour);
        this.bike.setOwnerName(neighbour);
    }

    public void startBike() {
        bike.start();
    }
    public void stopBike() {
        bike.stop();
    }
    public void accelarate() {
        bike.accelerate();
    }
    public void decelerate() {
        bike.decelerate();
    }
    public void driveBike() {
        bike.drive();
    }
    public void returnBike() {
        System.out.println("Returing bike to " + bike.getOwnerName());
    }
}