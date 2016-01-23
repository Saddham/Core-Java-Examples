/**
 * 
 */
package gex1;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 389733
 *
 */

class Student{
	int rollno;
	String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollno;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollno != other.rollno)
			return false;
		return true;
	}	
	
}

public class ComplexDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set<Student> students=new HashSet<Student>();
        Student student1=new Student();
        student1.setName("Jigar");
        student1.setRollno(12);
        students.add(student1);
        
        Student student2=new Student();
        student2.setName("Jigar");
        student2.setRollno(12);
        students.add(student2);
        
        System.out.println(students);
	}

}
