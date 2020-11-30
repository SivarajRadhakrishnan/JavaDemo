package com.javademo.classes;

import com.javademo.basics.Department;
import com.javademo.basics.Designation;
import com.javademo.basics.Gender;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 30/11/20
 * Time: 12:01 PM
 * To change this template use File | Settings | File and Code Templates.
 */
public class Employee2 {
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private Gender gender;
    private String dob;
    private Department department;
    private Designation designation;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    public Department getDepartment() {
        return department;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }
}