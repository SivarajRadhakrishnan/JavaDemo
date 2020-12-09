package com.javademo.abstraction.bank;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 9/12/20
 * Time: 11:52 AM
 * To change this template use File | Settings | File and Code Templates.
 */
public class AbstractionDemo {
    public static void main(String[] args) {
        BankingOperation bankingOperation = new BankingOperation();

        Customer customer = new Customer();
        customer.firstName = "Peter";
        customer.lastName = "Roebuck";
        customer.dob = "19/07/1975";
        customer.panNumber = "AHSTW2345I";
        customer.aadhaarNumber = "1234-5678-9874";

        String accNo = bankingOperation.createAcc(BankName.HDFC, AccountType.SAVINGS, customer);
        bankingOperation.depositAmt(BankName.HDFC, accNo, 5000);
        bankingOperation.withdrawAmt(BankName.HDFC, accNo, 2000);
        bankingOperation.checkBal(BankName.HDFC, accNo);


    }
}