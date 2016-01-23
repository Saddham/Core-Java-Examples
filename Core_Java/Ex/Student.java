package cts.student.reg;
/*

* Student will store students' registration information
* Author: 389733  
* Date Created: 10/09/2023
*/

public class Student{

  int registrationId;
  
  public void setRegistrationId(int rId){

    registrationId = rId;

  }//end of setRegistrationId
 
  public void dispRegistrationId(){

   System.out.println("The student registration id is "+registrationId);

  }//end dispRegistrationId

}//end of class