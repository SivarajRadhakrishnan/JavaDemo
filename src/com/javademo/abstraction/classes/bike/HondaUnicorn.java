package com.javademo.abstraction.classes.bike;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 11/12/20
 * Time: 12:45 PM
 * To change this template use File | Settings | File and Code Templates.
 */
public class HondaUnicorn extends Bike {
    @Override
    public void start() {
        System.out.println("Starting the bike using kickstart...");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating the bike using accelerator, gletch and gear.");
    }

    @Override
    public void decelerate() {
        System.out.println("Accelerating the bike using accelerator, gletch and gear.");
    }

    @Override
    public void drive() {
        System.out.println("Driving the bike using accelerator, gletch and gear.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the bike using accelerator, gletch and gear.");
    }
}