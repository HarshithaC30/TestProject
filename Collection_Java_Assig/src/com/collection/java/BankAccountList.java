package com.collection.java;

import java.util.TreeSet;

public class BankAccountList {

	private TreeSet accountlist;
	public BankAccountList() {
		accountlist = new TreeSet<>();
	}
	
public void addBankAccount(SavingsAccount acc)	{
	accountlist.add(acc);
}

public TreeSet<SavingsAccount>getAllAccount(){
	return accountlist;
}
}
