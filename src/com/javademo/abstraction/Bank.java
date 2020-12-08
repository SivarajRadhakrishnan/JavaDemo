package com.javademo.abstraction;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 8/12/20
 * Time: 12:10 PM
 * To change this template use File | Settings | File and Code Templates.
 */
public interface Bank {
    public String createAccount(Customer customer);
    public void depositAmount(long accNo, double amount);
    public void withdrawAmount(long accNo, double amount);
    public void checkBalance(long accNo);
}