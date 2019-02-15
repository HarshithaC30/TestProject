package com.Array.Emp;

public class MainClass {

	public static void main(String[] args) {
		
		MyArrayList list = new MyArrayList(2);
		Employee e1 = new Employee(001, "aabc", 15000.00);
		Employee e2 = new Employee(002, "pqr", 10000.45);
		Employee e3 = new Employee(003, "xyz", 31100.90);
		list.addEmp(e1);
		list.addEmp(e2);
		list.addEmp(e3);

		/*boolean conf = Object.addEmp();

		if(conf)
			System.out.println("employee addedd successfully");
		else
			System.out.println("failed to add employess");*/
		list.dispEmp();
		list.getEmployee(002);
		
		
		list.deleteEmployee(001);
		list.deleteEmployee(002);
		//list.deleteEmployee(003);
		
		
		int x=list.deleteEmployee(1111);
		if(x==-1)
			System.out.println("there are no employees to delete");
		else if(x==0)
			System.out.println("employee not found with given id");
		else
			System.out.println("employee deleted successfully");
		
		list.dispEmp();
	}

}
