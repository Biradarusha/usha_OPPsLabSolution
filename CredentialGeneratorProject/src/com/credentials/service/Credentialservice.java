package com.credentials.service;

import java.util.Random;

import com.credentials.model.Employee;



public class Credentialservice {
	public void showCredential(Employee e,String department) {
		System.out.println("Dear " +e.getFirstName() + " Your Generated Credentials Are As Follows");
		System.out.println("Email ------>" + generateEmailadress(e,department));
		System.out.println("Password----->" + generatePassword());
		
		
		
	}
	private String generatePassword() {
		String code = "ABCDEFGHIJJKMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789$%&@*!";
		String pwd = "";

		Random r = new Random();

		
		for (int i = 1; i <= 6; i++) {
			pwd = pwd + code.charAt(r.nextInt(code.length()));
		}
		
		return pwd;
	}

	

	private String generateEmailadress(Employee e, String department) {
	
		return e.getFirstName().toLowerCase() + e.getLastName().toLowerCase() + "@" + department + ".abc.com";
	}


	

}
