package com.javademo.basics;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 11/11/20
 * Time: 12:04 PM
 * To change this template use File | Settings | File and Code Templates.
 */
public class ArithmeticOperationsDemo {
//    https://www.geeksforgeeks.org/java-arithmetic-operators-with-examples/
    public static void main(String[] args) {
        int a = 30;
        int b = 6;

        int c = 31;
        int d = 6;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (c % d));

        //a = a+1;
        //a = a++;
//        a++;
//        ++a;
        a--;
        --a;
//      System.out.println("a = " + (++a + b));
//        System.out.println("a = " + (a++ + b));
        System.out.println("a = " + a);
    }
}