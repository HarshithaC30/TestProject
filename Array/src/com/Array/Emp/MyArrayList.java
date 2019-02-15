package com.Array.Emp;

public class MyArrayList {
	private Employee[] emp;
	int top = -1;
	private int size;
	
	public MyArrayList(int n) {
		size=n;
		emp = new Employee[n];
	}
	
	public boolean addEmp(Employee e) {
		if(!isFull()) {
			top++;
			emp[top] = e;
			return true;
		}
		else
			return false;
	}
	
	public int deleteEmployee(int empId) {
		int index=-1;
		int temp=-1;
		if(!isEmpty()) {
			for(int i=0;i<=top;i++) {
				if(emp[i].getEmpID()==empId)
					index=i;
			}
			if(index!=-1) {
				for(int i=index;i<top;i++) {
					emp[i]=emp[i+1];
					
					
				}
				temp=1;
				top--;
				
			}
			else
			   temp=0;
					
			
		}
		return temp;
		
	}
	
	public boolean isFull() {
		if(top==size-1)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty() {
		if(top==-1)
			return true;
		else
			return false;
	}
	
	public void dispEmp() {
		for(int i=0;i<=top;i++) {
			System.out.println(toString());
		}
	}
	
	public void getEmployee(int empID) {
		for (int i = 0; i <= top; i++) {
			if(emp[i].getEmpID()==empID)
				System.out.println(emp[i].getEmpID()+" "+emp[i].getEmpName()+" "+emp[i].getEmpSal());
		}
	}
	
}
