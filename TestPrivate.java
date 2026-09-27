package Packages.testpackage;

import Packages.mypackage.BankAccount;

public class TestPrivate 
{
    
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount();

        System.out.println(account.getBalance());
    }
}
