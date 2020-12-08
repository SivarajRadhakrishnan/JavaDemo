package com.javademo.abstraction;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 8/12/20
 * Time: 12:22 PM
 * To change this template use File | Settings | File and Code Templates.
 */
public class ICICIBank implements Bank {
    @Override
    public String createAccount(Customer customer) {
        return null;
    }

    @Override
    public void depositAmount(long accNo, double amount) {

    }

    @Override
    public void withdrawAmount(long accNo, double amount) {

    }

    @Override
    public void checkBalance(long accNo) {

    }
}