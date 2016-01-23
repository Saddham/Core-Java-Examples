/**
 * 
 */
package com.cognizant.inheritance.activity;

/**
 * @author 389733
 *
 */
 class Employee {

	long employeeId;
	String employeeName;
   	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance=250.80;
	double hra=1000.50;
	
	public Employee(long id, String name, String address, long phone, double salary){
		this.employeeId=id;
		this.employeeName=name;
		this.employeeAddress=address;
		this.employeePhone=phone;		
		this.basicSalary=salary;
	}

	public void calculateSalary(){
		double salary=0;
		salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100); 
	    System.out.println("Salary of the employee is "+salary);
	}
	
	public void calculateTransportAllowance(){
		double transportAllowance=0;
		transportAllowance=basicSalary*10/100;
		System.out.println("Transport allowance: "+transportAllowance);
	}
 }
 
 class Manager extends Employee{
		
		public Manager(long id, String name, String address, long phone, double salary){
			super(id, name, address, phone, salary);		
		}
		
		public void calculateTransportAllowance(){
			double transportAllowance=0;
			transportAllowance=basicSalary*15/100;
			System.out.println("Transport allowance: "+transportAllowance);
		}
	}
	
  class Trainee extends Employee{
		public Trainee(long id, String name, String address, long phone, double salary){
			super(id, name, address, phone, salary);		
		}
	}
	

