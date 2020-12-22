package com.javademo.abstraction.interfaces.bank;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 8/12/20
 * Time: 12:22 PM
 * To change this template use File | Settings | File and Code Templates.
 */
public class HDFCBank implements Bank, CreditCard {
    @Override
    public String createAccount(AccountType accountType, Customer customer) {
        String accNo = generateAccNo();
        System.out.println("\n\nHDFC " + accountType + " account successfully created for the customer: " + customer.firstName);
        System.out.println("Account No: " + accNo + " account successfully created for the customer: " + customer.firstName);
        return accNo;
    }

    @Override
    public void depositAmount(String accNo, double amount) {
        System.out.println("\n\nAmount Rs." + amount + " has been successfully deposited to the account-" + accNo);
    }

    @Override
    public void withdrawAmount(String accNo, double amount) {
        System.out.println("\n\nYou have successfully withdrawn amount Rs." + amount + " from the account: " + accNo);
    }

    @Override
    public void checkBalance(String accNo) {
        System.out.println("\n\nYou account balance : " + getBalanceAmount());
    }

    private String generateAccNo()
    {
        Random random = new Random();
        return random.nextInt(99999999) + "";
    }

    private String getBalanceAmount()
    {
        Random random = new Random();
        return random.nextInt(99999) + "";
    }

    public float get_PL_InterestRate()
    {
        return 8.5F;
    }

    @Override
    public void issueCard() {

    }
}