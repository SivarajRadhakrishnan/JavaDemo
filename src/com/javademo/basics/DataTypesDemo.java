package com.javademo.basics;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 11/11/20
 * Time: 11:42 AM
 * To change this template use File | Settings | File and Code Templates.
 */
public class DataTypesDemo {
//  https://www.w3schools.com/java/java_data_types.asp
    public static void main(String[] args) {
        /*Variable declaration syntax*/
        /*<data-type> <variable-name> [<assignment-operator> <value>];*/
        /*Integer(whole number) data types*/

        byte byt = 127;
        short shrt = 100;
        int age = 30;
        int bonus;
        long weight = 95;

        /*decimal point data types*/
        double salary = 50000.0;
        float incentives = 5000.0F;

        /*character data types*/
        char grade = 'A';

        /*boolean data types*/
        boolean isIndian = false;
        byt = (byte)(byt + 129);
        //System.out.println("Byte value : " + byt);

        bonus = 500;
        System.out.println("Bonus value(int) : " + bonus);

        String genderString = "asdasdasd";
        System.out.println("String Gender: " + genderString);

        Gender gender = Gender.MALE;
        System.out.println("Enum Gender: " + gender);
    }
}
