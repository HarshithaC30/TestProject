package com.collection.domain;

import java.util.Iterator;
import java.util.TreeSet;
import com.collection.java.SavingsAccount;

public class TestBankAccount {
	public static void main(String[] args) {
		
		TreeSet<SavingsAccount> accounts=new TreeSet<>();
		SavingsAccount a1=new SavingsAccount(1,"abc",39384.56,true);
		SavingsAccount a2=new SavingsAccount(2,"pqr",4658.474,false);
		SavingsAccount a3=new SavingsAccount(3,"xyz",278368.00,true);
		//SavingsAccount a4=new SavingsAccount();
		//SavingsAccount a5=new SavingsAccount();
		
		accounts.add(a1);
		accounts.add(a2);
		accounts.add(a3);
		//accounts.add(a4);
		//accounts.add(a5);
		
		
		Iterator itr=accounts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			
		}

	}
}
