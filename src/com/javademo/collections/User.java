package com.javademo.collections;

import com.javademo.basics.Gender;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 28/12/20
 * Time: 11:53 AM
 * To change this template use File | Settings | File and Code Templates.
 */
public class User {
    int id;
    String firstName;
    String lastName;
    Gender gender;
    String dob;
    Employment employment;

    public User(int id, String firstName, String lastName, String dob, Gender gender, Employment employment)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.employment = employment;
    }

    public int getId(){
        return id;
    }
}