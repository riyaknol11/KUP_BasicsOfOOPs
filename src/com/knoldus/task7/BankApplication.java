package com.knoldus.task7;

public class BankApplication {
    public static void main(String[] args) {
        Customer customer = new Customer();
        double account_balance=15000;
        customer.setAccountbalance(account_balance);
        System.out.println("Current Balance of the customer is: "+customer.getAccountbalance());
    }
}
