package com.bridzelabz.regexPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static boolean isValidUsername(String name)
	{
		String regex = "^[A-Za-z]\\w+{3,29}$";
		Pattern p = Pattern.compile(regex);
		if (name == null) {
			return false;
		}
		Matcher m = p.matcher(name);
		return m.matches();
	}
	public static boolean isValidEmail(String email) {
		String regex =  "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		Pattern p = Pattern.compile(regex);
		if (email == null) {
			return false;
		}
		Matcher m = p.matcher(email);
		return m.matches();
	}
	public static boolean isValidMobileFormat(String mobileNumber) {
		String regex =  "^([9]{1})([1]{1})([0-9]{10})$";
		Pattern p = Pattern.compile(regex);
		if (mobileNumber == null){
			return false;
		}
		Matcher m = p.matcher(mobileNumber);
		return m.matches();
	}
	public static boolean isValidPassword(String password) {
		String regex =  "^([aA-zZ]{8})[0-9]{3}[@$+&*]{1}$";
		Pattern p = Pattern.compile(regex);
		if (password == null){
			return false;
		}
		Matcher m = p.matcher(password);
		return m.matches();
	}
}
