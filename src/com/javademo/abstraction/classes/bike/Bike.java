package com.javademo.abstraction.classes.bike;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 11/12/20
 * Time: 12:44 PM
 * To change this template use File | Settings | File and Code Templates.
 */
abstract public class Bike {
    private String ownerName;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    abstract public void start();
    abstract public void accelerate();
    abstract public void decelerate();
    abstract public void drive();
    abstract public void stop();
}