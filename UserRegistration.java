package com.bridzelabz.regexPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public boolean isValidUsername(String name)
	{
		String regex = "^[A-Za-z]{3,26}$";
		Pattern p = Pattern.compile(regex);
		if (name == null) {
			return false;
		}
		Matcher m = p.matcher(name);
		return m.matches();
	}
	public  boolean isValidEmail(String email) {
		String regex =  "abc[.][a-z]{3}@bl[.]co[.][a-z]{2}";
		Pattern p = Pattern.compile(regex);
		if (email == null) {
			return false;
		}
		Matcher m = p.matcher(email);
		return m.matches();
	}
	public  boolean isValidMobileFormat(String mobileNumber) {
		String regex =  "^(91 )([0-9]{10})$";
		Pattern p = Pattern.compile(regex);
		if (mobileNumber == null){
			return false;
		}
		Matcher m = p.matcher(mobileNumber);
		return m.matches();
	}
	public  boolean isValidPassword(String password) {
		String regex =  "^([aA-zZ]{8})[0-9]{3}[@$+&*]{1}$";
		Pattern p = Pattern.compile(regex);
		if (password == null){
			return false;
		}
		Matcher m = p.matcher(password);
		return m.matches();
	}
	public  boolean isValidAllEmailSamples(String emails) {
	    String regex =  "^[0-9a-zA-Z]+([_+-.]{1}[a-z0-9A-Z]+)*[@][a-zA-Z]+[.][a-z]{2,4}([.][a-z]{2})?$";
		Pattern p = Pattern.compile(regex);
		if (emails == null) {
			return false;
		}
		Matcher m = p.matcher(emails);
		return m.matches();
	}
}
