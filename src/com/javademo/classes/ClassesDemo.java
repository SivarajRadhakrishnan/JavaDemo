package com.javademo.classes;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 11/11/20
 * Time: 11:42 AM
 * To change this template use File | Settings | File and Code Templates.
 */
public class ClassesDemo {
    public static void main(String[] args) {
        /*Class creations syntax*/
        /*<access-provider> class <class-name>{
                <access-provider> <data-type> <variable-name1>;
            <access-provider> <data-type> <variable-name2>;
            .
            .
            .
            <access-provider> <data-type> <variable-namen>;

            <access-provider> <class-name>([<arguments/parameters>]){
                logics...
            }

            <access-provider> <return-type> <method-name-1>([<arguments/parameters>]){
                logics...
            }

            <access-provider> <return-type> <method-name-2>([<arguments/parameters>]){
                logics...
            }
            .
            .
            .
            <access-provider> <return-type> <method-name-n>([<arguments/parameters>]){
                logics...
            }

        }*/

        Car car = new Car("Hyundai","Santro","Blue","HatchBack","Petrol");
        Car car2 = new Car();
        Car car3;

        car.print();
        car2.print();
    }
}