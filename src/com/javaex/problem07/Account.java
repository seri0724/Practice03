package com.javaex.problem07;

public class Account {

    private String accountNo;
    private int balance;
    
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    	balance = 0;
    }  
    public void deposit(int money) {
    	balance += money;
    }   
    public void withdraw(int money) {
    	if(balance > money) {
    		balance -= money;
    	}
    }   
    public void showBalance() {
    	System.out.println(balance);
    }
}