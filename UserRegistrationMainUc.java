package com.bridzelabz.regexPattern;
import java.util.regex.*;
import java.util.*;

public class UserRegistrationMainUc {

	
	public static void main(String[] args)
	{
        Scanner sc =new Scanner(System.in);
        UserRegistration uc = new UserRegistration();
        System.out.println("Enter the First Name: " );
		String FirstName = sc.next();
		System.out.println(uc.isValidUsername(FirstName));

	    System.out.println("Enter the Last Name: " );
		String LastName = sc.next();
		System.out.println(uc.isValidUsername(LastName));

		System.out.println("Enter the Email: " );
		String email = sc.next();
		System.out.println(uc.isValidEmail(email));
		
		System.out.println("Enter the Mobile number: " );
		String mobileNumber = sc.next();
		System.out.println(uc.isValidMobileFormat(mobileNumber));
		
		System.out.println("Enter the password: " );
		String password = sc.next();
		System.out.println(uc.isValidPassword(password));
	}

}


