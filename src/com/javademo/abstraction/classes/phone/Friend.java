package com.javademo.abstraction.classes.phone;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 11/12/20
 * Time: 12:15 PM
 * To change this template use File | Settings | File and Code Templates.
 */
public class Friend {
    public static SmartPhone getPhone(String friendName)
    {
        SmartPhone phone = null;
        if(friendName.equalsIgnoreCase("Veera"))
            phone = new SamsungPhone();
        else if(friendName.equalsIgnoreCase("ShriRaghavi"))
            phone = new IPhone();
        return phone;
    }
}