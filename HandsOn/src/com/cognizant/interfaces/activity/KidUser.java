/**
 * 
 */
package com.cognizant.interfaces.activity;

/**
 * @author 389733
 *
 */
public class KidUser implements LibraryUser {

	int age;
	String bookType;
	
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param bookType the bookType to set
	 */
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	/* (non-Javadoc)
	 * @see com.cognizant.interfaces.activity.LibraryUser#registerAccount()
	 */
	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		if(age<12)
		   System.out.println("You have successfully registered under a Kids Account");
	    else
	       System.out.println("Sorry, Age must be less than 12 to register as a kid"); 

	}

	/* (non-Javadoc)
	 * @see com.cognizant.interfaces.activity.LibraryUser#requestBook()
	 */
	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if(bookType.equalsIgnoreCase("Kids"))
		   System.out.println("Book Issued successfully, please return the book within 10 days");
	    else
	       System.out.println("Oops, you are allowed to take only kids books");
	}

}
