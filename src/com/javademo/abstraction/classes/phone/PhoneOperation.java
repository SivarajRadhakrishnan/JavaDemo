package com.javademo.abstraction.classes.phone;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 11/12/20
 * Time: 12:13 PM
 * To change this template use File | Settings | File and Code Templates.
 */
public class PhoneOperation {

    public void doCall(String friendName)
    {
        System.out.println("Using " + friendName + "'s phone.");
        SmartPhone phone = Friend.getPhone(friendName);
        phone.call();
    }

    public void sendMessage(String friendName)
    {
        System.out.println("Using " + friendName + "'s phone.");
        SmartPhone phone = Friend.getPhone(friendName);
        phone.call();
    }

    public void readMessage(String friendName)
    {
        System.out.println("Using " + friendName + "'s phone.");
        SmartPhone phone = Friend.getPhone(friendName);
        phone.call();
    }
}