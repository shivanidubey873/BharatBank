package com.tw;
public class BharatBankInterestCalculator {
    public static void main(String[] args) {
        BharatBank gopalAccount= new BharatBank(50000,"current");
        BharatBank amritaAccount = new BharatBank(100000,"savings");
        gopalAccount.deposit(10000);
        amritaAccount.withdraw(45000);
        System.out.println(gopalAccount.getQuarterlyInterest());
        System.out.println(amritaAccount.getQuarterlyInterest());
        gopalAccount.withdraw(70000);
        System.out.println(gopalAccount.getBalance()); //Balance after withdrawal of 70k
        System.out.println(amritaAccount.getBalance()); //Balance after lat withdrawal of 45k
    }
}
