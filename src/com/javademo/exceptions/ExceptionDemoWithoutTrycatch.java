package com.javademo.exceptions;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 7/1/21
 * Time: 11:26 AM
 * To change this template use File | Settings | File and Code Templates.
 */
public class ExceptionDemoWithoutTrycatch {
    public static void main(String[] args) {
//        System.out.println(divide(5, 2));
//        System.out.println(divide(5, 0));
//        System.out.println(divide(4, 2));
//        System.out.println(divide(20, 19));

        int[] salary = new int[5];
        salary[0] = 12000;
        salary[1] = 14000;
        salary[2] = 16000;
        salary[3] = 18000;
        salary[4] = 20000;

        System.out.println(salary[2]);
        System.out.println(salary[5]);
        System.out.println(salary[0]);
    }

    private static int divide(int dividend, int divisor)
    {
        return dividend/divisor;
    }
}