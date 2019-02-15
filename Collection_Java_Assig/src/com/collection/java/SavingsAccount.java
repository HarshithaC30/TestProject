package com.collection.java;

public class SavingsAccount implements Comparable<SavingsAccount> {

	private int acc_ID;
	private String accHolderName;
	private double acc_balance;
	private boolean isSalaryAccount;
	
	public SavingsAccount() {

	}
	
	public SavingsAccount(int acc_ID, String accHolderName, double acc_balance, boolean isSalaryAccount) {
		super();
		this.acc_ID = acc_ID;
		this.accHolderName = accHolderName;
		this.acc_balance = acc_balance;
		this.isSalaryAccount = isSalaryAccount;
	}

	public int getAcc_ID() {
		return acc_ID;
	}
	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	
	public double withdrawl(double amt)
	{
		if(amt<=acc_balance)
		{
			acc_balance = acc_balance - amt;
			//System.out.println("Rs."+acc_balance+" is withdrawed");
		}
		else
			System.out.println("Amount exceeded account balance");
		return acc_balance;
	}
	public double deposit(double amt)
	{
		acc_balance = acc_balance + amt;
		//System.out.println("Rs."+amt+" is added to account");
		return acc_balance;
	}
	
	@Override
	public String toString() {
		return "SavingsAccount [acc_ID=" + acc_ID + ", accHolderName=" + accHolderName + ", acc_balance=" + acc_balance
				+ ", isSalaryAccount=" + isSalaryAccount + "]";
	}

	@Override
	public int compareTo(SavingsAccount arg0) {
		if(acc_ID>arg0.getAcc_ID())
			return 1;
		else if(acc_ID<arg0.getAcc_ID())
			return -1;
		return 0;
		
	}
	
}
