package com.javademo.exceptions;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 5/1/21
 * Time: 11:36 AM
 * To change this template use File | Settings | File and Code Templates.
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Program starts..");
//        divisionWithoutException();
        try
        {
            divisionWithoutException();
        }catch (Exception e)
        {

        }
        divisionWithException();
        System.out.println("Program ends..");
    }

    private static void divisionWithoutException()
    {
        System.out.println("divisionWithoutException starts..");
        int a = 5;
        int b = 0;
        System.out.println(a/b);
        System.out.println("divisionWithoutException ends..");
    }

    private static void divisionWithException()
    {
        System.out.println("divisionWithException starts..");
        int a = 5;
        int b = 0;
        try
        {
            System.out.println("Try block start...");
            System.out.println(a/b);
            System.out.println("Try block end...");
        }catch (ArithmeticException e)
        {
            System.out.println("Divide by zero error");
        }
        System.out.println("divisionWithException ends..");
    }
}