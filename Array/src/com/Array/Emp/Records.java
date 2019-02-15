package com.Array.Emp;

public class Records {
	
	private Employee[] e;
	private int size;
	
	public Records() {
		this.e =new Employee[10];
		this.size = 0;
	}
	public void addEmp(int empID, String empName, double empSal)
	{
		this.e[size] = new Employee(empID, empName, empSal);
		this.size++;
	}
	public  void empDetails()
	{
		for(int i=0;i<this.size;i++)
			this.e[i].toString();
	}

	

}
