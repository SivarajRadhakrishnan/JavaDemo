package com.javademo.abstraction.classes.phone;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 11/12/20
 * Time: 12:14 PM
 * To change this template use File | Settings | File and Code Templates.
 */
public class PhoneAbstractionDemo {
    public static void main(String[] args) {
        PhoneOperation phoneOperation = new PhoneOperation();
        phoneOperation.doCall("Veera");
        phoneOperation.sendMessage("ShriRaghavi");
        phoneOperation.readMessage("ShriRaghavi");
    }
}