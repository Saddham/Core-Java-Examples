package cts.bfs.amex;
/*
*Employee will use to strore Employee Date
*created by 389733
*on 10/09/2013
*/
public class Employee
{
 //varialble declaration
 int empNo;
 String empName;
 
 public void setEmployee(int eno, String name){
  
  empNo=eno;
  empName=name;
  
 }//end of setEmployee

 public void dispEmployee(){
  
  System.out.println("Employee Number => "+empNo);
  System.out.println("Employee Name => "+empName);

 }//end of dispEmployee

}//end of class