package com.javademo.abstraction.interfaces;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 8/12/20
 * Time: 12:21 PM
 * To change this template use File | Settings | File and Code Templates.
 */
public class BankingOperation {

    public String createAcc(BankName bankName, AccountType accountType, Customer customer)
    {
        Bank bank = Bankers.getBank(bankName);
        return bank.createAccount(accountType, customer);
    }

    public void depositAmt(BankName bankName, String accNo, double amount)
    {
        Bank bank = Bankers.getBank(bankName);
        bank.depositAmount(accNo, amount);
    }

    public void withdrawAmt(BankName bankName, String accNo, double amount)
    {
        Bank bank = Bankers.getBank(bankName);
        bank.withdrawAmount(accNo, amount);
    }

    public void checkBal(BankName bankName, String accNo)
    {
        Bank bank = Bankers.getBank(bankName);
        bank.checkBalance(accNo);
    }
}