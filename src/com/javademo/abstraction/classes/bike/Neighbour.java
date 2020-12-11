package com.javademo.abstraction.classes.bike;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 11/12/20
 * Time: 12:49 PM
 * To change this template use File | Settings | File and Code Templates.
 */
public class Neighbour {
    public static Bike getBike(String neighbour)
    {
        Bike bike = null;
        if(neighbour.equals("Peter"))
            bike = new HondaUnicorn();
        else if(neighbour.equals("James"))
            bike = new TVSJupiter();
        return bike;
    }
}