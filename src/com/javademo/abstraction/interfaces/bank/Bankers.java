package com.javademo.abstraction.interfaces.bank;

/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 9/12/20
 * Time: 11:53 AM
 * To change this template use File | Settings | File and Code Templates.
 */
public class Bankers {
    public static Bank getBank(BankName bankName)
    {
        Bank bank = null;
        if(bankName == BankName.HDFC)
            bank = new HDFCBank();
        else if(bankName == BankName.ICICI)
            bank = new ICICIBank();
        return bank;
    }
}