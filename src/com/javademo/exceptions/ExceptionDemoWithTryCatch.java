package com.javademo.exceptions;

import com.javademo.collections.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 7/1/21
 * Time: 11:30 AM
 * To change this template use File | Settings | File and Code Templates.
 */
public class ExceptionDemoWithTryCatch {
    public static void main(String[] args) {

        System.out.println(divide2(5, 2));
        try
        {
            System.out.println(divide2(5, 0));
        }catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
        System.out.println(divide2(4, 2));
        System.out.println(divide2(20, 19));

        readFile("/opt/softwares/Sample.txt");

        try
        {
            System.out.println(divide3(3, 0));
        }catch (MyException e)
        {
            e.printStackTrace();
        }
        System.out.println(divide(5, 2));
        System.out.println(divide(5, 0));
        System.out.println(divide(4, 2));
        System.out.println(divide(20, 19));
    }

    private static int divide(int dividend, int divisor)
    {
        System.out.println("Divide method called....");
        int value = -1;
        try
        {
            value = dividend/divisor;
            User user = null;
            user.getId();
        }catch (ArithmeticException e)
        {
            e.printStackTrace();
        }catch (NullPointerException e)
        {
            System.out.println("Caught a NullPointerException");
        }finally {
            System.out.println("finally block executed");
        }
        return value;
    }

    private static int divide2(int dividend, int divisor)throws ArithmeticException, NullPointerException
    {
        System.out.println("Divide2 method called....");
        return dividend/divisor;
    }

    private static int divide3(int dividend, int divisor)throws MyException
    {
        if(divisor == 0)
            throw new MyException("This is a custom exception");
        return dividend/divisor;
    }

    private static void readFile(String filePath)
    {
        try
        {
            File file = new File(filePath);
            FileReader fr = new FileReader(file);
            int i;
            while ((i=fr.read()) != -1)
                System.out.print((char) i);

        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}