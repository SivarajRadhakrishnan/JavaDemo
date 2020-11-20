package com.javademo.basics;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 11/11/20
 * Time: 11:42 AM
 * To change this template use File | Settings | File and Code Templates.
 */
public class ArraysAndLoopsDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 3;
        arr[3] = 2;
        arr[4] = 1;

        int[] b = {1,2,3,4,5};
        char[] grades = {'A','B','C','D'};
        float[] salaries = {50000.0F,60000.12F,55000.45F,57000.28F};

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);

//        System.out.println(salaries[0]);
//        System.out.println(salaries[1]);
//        System.out.println(salaries[2]);
//        System.out.println(salaries[3]);


//        3 types of loop
//        1) For loop
//        2) While loop
//        3) Do while loop
//        Reference : https://www.geeksforgeeks.org/loops-in-java/

//          For Loop
//          ---------
//            Format:
//            for(initialization: condition: increment)
//            {
//                statement;
//            }
        System.out.println("For Loop...");
        int i;
        for(i=0; i<=3; i++)
        {
            System.out.println(salaries[i]);
        }


//        While Loop
//        -----------
//        Format:
//        while(condition)
//        {
//            statement;
//            increment;
//        }
//
        System.out.println("\nWhile Loop...");
        int j=0;
        while(j<4)
        {
            System.out.println(salaries[j]);
            j++;
        }
        //System.out.println(j);

//        Do-while loop
//        --------------
//        Format:
//        do {
//            statement;
//        }while(condition);


        System.out.println("\nDo-While Loop...");
        int k=0;
        do {
            System.out.println(salaries[k]);
            k++;
        }while (k<4);
    }
}