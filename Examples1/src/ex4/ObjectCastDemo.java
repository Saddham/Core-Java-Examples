package ex4;

class Person
{
	String name;
	public void dispName()
	{
		System.out.println("Name = "+name);
	}
}

class Employee extends Person
{
	int empno;
	double salary;
	public void dispEmp()
	{
		System.out.println("EmpNo = "+empno);
		dispName();
		System.out.println("Salary = "+salary);
		
	}
	
}

class Manager extends Employee
{
	double ta;
	public void dispManager()
	{
		dispEmp();
		ta = salary * 0.15;
		System.out.println("TA = "+ta);
		
	}
}

public class ObjectCastDemo {
	
	public static void main(String[] args) {
		Person person;	//Reference declaration 
		
		Employee employee = new Employee();		//instance of employee
		
		person = employee;	//Widening
		person.dispName();
		person = new Manager();
		
		Manager m = new Manager();
		
		m.dispName();
		
		Employee emp3 = (Employee)person;
		
	}
	
}
