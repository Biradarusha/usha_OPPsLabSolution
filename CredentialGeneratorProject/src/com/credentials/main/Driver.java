package com.credentials.main;

import java.util.Scanner;

import com.credentials.model.Employee;
import com.credentials.service.Credentialservice;

public class Driver {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter firstNmae :");
		String firstName = in.nextLine();
		System.out.print("Enter lastName :");
		String lastName  = in.nextLine();
		
		Employee e1= new Employee(firstName, lastName);
		
		Credentialservice cs = new Credentialservice();
		
		System.out.println("Please Enter The Department From The Following ");
		System.out.println("\n 1.Technical \n 2.Admin \n 3.Human Resource \n 4.Legal");
		int option = in.nextInt();
		
		switch(option) {
		case 1 :
			cs.showCredential(e1, "tech");
			break;
			
		case 2 :
			cs.showCredential(e1, "admin");
			break;
			
		case 3 :
			cs.showCredential(e1, "hr");
			break;
			
		case 4 :
			cs.showCredential(e1, "legal");
			break;
			
			default :
				System.out.println("Invalid Department");
				break;
		}
		
		in.close();
		}
}
