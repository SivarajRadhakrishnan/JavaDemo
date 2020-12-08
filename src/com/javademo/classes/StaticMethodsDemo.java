package com.javademo.classes;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 7/12/20
 * Time: 12:07 PM
 * To change this template use File | Settings | File and Code Templates.
 */
public class StaticMethodsDemo {

    static int value;
    /*Normal Method declaration syntax
     ---------------------------------
     <access-provider> <return-type(any data type)> method-name(<args/parameters>)
     {
     }
    * */

    /*Static Method declaration syntax
     ---------------------------------
     <access-provider> static <return-type(any data type)> method-name(<args/parameters>)
     {
     }
    * */
    public static void hi()
    {
        System.out.println("Hi..");
    }

    public static void hello()
    {
        System.out.println("Hello..");
    }
}