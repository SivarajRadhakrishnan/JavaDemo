package com.javademo.classes;

import com.javademo.basics.*;

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

        /*Access Specifiers
        * private
        * protected
        * public
        * default
        * */

        Vehicle vehicle = new Vehicle("Hyundai","Santro","Blue", VehicleType.CAR, FuelType.PETROL);
        Vehicle vehicle2 = new Vehicle();
        Vehicle vehicle3;

//        Vehicle vehicle4 = new Vehicle("Hyundai","Santro","Blue", VehicleType.CAR);
//        Vehicle vehicle5 = new Vehicle("Hyundai","Santro","Blue", FuelType.PETROL, VehicleType.CAR);

        vehicle.print();
        vehicle2.print();

        Employee employee = new Employee();
        employee.id = 123;
        employee.firstName="Peter";
        employee.lastName="James";
        employee.dob="15/09/1980";
        employee.gender = Gender.MALE;
        employee.department = Department.QA;
        employee.designation = Designation.ENGINEER;

        System.out.println(employee.id);
        System.out.println(employee.firstName);
        System.out.println(employee.lastName);
        System.out.println(employee.dob);
        System.out.println(employee.department);
        System.out.println(employee.designation);


        Employee2 employee2 = new Employee2();
        employee2.setId(456);
        employee2.setFirstName("Anita");
        employee2.setLastName("Kumari");
        employee2.setDob("22/09/1984");
        employee2.setGender(Gender.FEMALE);
        employee2.setDepartment(Department.HR);
        employee2.setDesignation(Designation.SENIOR_MANAGER);

        System.out.println("--------------------------------------");

        System.out.println(employee2.getId());
        System.out.println(employee2.getFirstName());
        System.out.println(employee2.getMiddleName());
        System.out.println(employee2.getLastName());
        System.out.println(employee2.getDob());
        System.out.println(employee2.getGender());
        System.out.println(employee2.getDepartment());
        System.out.println(employee2.getDesignation());


        Car car = new Car();
        car.make = "Suzuki";
        car.model = "Wagonr";
        car.color = "Gold";
        car.fuelType = FuelType.PETROL;
        car.capacity = 4;
        car.engineCC = 1500;

        car.printCar();
        car.overrideMethod();

        System.out.println("Static value(before setting value) = " + StaticMethodsDemo.value);
        StaticMethodsDemo.value = 5;
        StaticMethodsDemo.hi();
        StaticMethodsDemo.hello();
        System.out.println("Static value(after setting value) = " + StaticMethodsDemo.value);
    }
}