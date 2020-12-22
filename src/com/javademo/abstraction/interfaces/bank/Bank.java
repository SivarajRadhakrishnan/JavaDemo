package com.javademo.abstraction.interfaces.bank;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 8/12/20
 * Time: 12:10 PM
 * To change this template use File | Settings | File and Code Templates.
 */
public interface Bank {
    public String createAccount(AccountType accountType, Customer customer);
    public void depositAmount(String accNo, double amount);
    public void withdrawAmount(String accNo, double amount);
    public void checkBalance(String accNo);
}