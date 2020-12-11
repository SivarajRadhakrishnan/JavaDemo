package com.javademo.abstraction.classes.phone;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 11/12/20
 * Time: 12:11 PM
 * To change this template use File | Settings | File and Code Templates.
 */
public class IPhone extends SmartPhone {
    @Override
    public void call() {
        System.out.println("Calling.. using ios app");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending message.. using ios app");
    }

    @Override
    public void readMessage() {
        System.out.println("Reading message.. using ios app");
    }

    @Override
    public void installApp() {
        System.out.println("Installing app.. using ios app");
    }
}