package com.javademo.classes;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 7/12/20
 * Time: 12:24 PM
 * To change this template use File | Settings | File and Code Templates.
 */
public class ArithmeticOperationsDemo {
    public static void main(String[] args) {
        ArithmeticOperations arithOps = new ArithmeticOperations();
        System.out.println("Arithmetic Operations for whole numbers: 10, 5");
        System.out.println("-----------------------------------------------");
        System.out.println("Addition = " + arithOps.add(10, 5));
        System.out.println("Subtraction = " + arithOps.sub(10, 5));
        System.out.println("Multiplication = " + arithOps.mul(10, 5));
        System.out.println("Division = " + arithOps.div(10, 5));

        System.out.println("\nArithmetic Operations for decimal numbers: 10.5, 5.6");
        System.out.println("------------------------------------------------------");
        System.out.println("Addition = " + arithOps.add(10.5F, 5.6F));
        System.out.println("Subtraction = " + arithOps.sub(10.5F, 5.6F));
        System.out.println("Multiplication = " + arithOps.mul(10.5F, 5.6F));
        System.out.println("Division = " + arithOps.div(10.5F, 5.6F));

    }
}