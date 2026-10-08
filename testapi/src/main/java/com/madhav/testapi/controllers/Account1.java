package com.madhav.testapi.controllers;
class Account{
//	accountNumber (int)
//
//	accountHolderName (String)
//
//	balance (double)
	private int accountNumber;
	private String accountHolder;
	private double balance;
	public Account(int accountNumber, String accountHolder, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	public double deposite(int money)
	{
		balance=balance+money;
		return balance;
	}
	public double withDrowMoney(int money)
	{
		if(balance>0)
		{
			balance=balance-money;
			return balance;
		}
		else 
		{
			System.out.println("Insufficient balance");
			return -1;
		}
		
	}
	public double CheakBalance()
	{
		return balance;
	}
//	public void Details()
//	{
//		
//	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", balance=" + balance
				+ "]";
	}
	
}
public class Account1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Account ac=new Account(101,"AMAN",50000);
    
  System.out.println( ac.deposite(500));   
  System.out.println(ac.CheakBalance());
  System.out.println(ac);
     
   	}

}
