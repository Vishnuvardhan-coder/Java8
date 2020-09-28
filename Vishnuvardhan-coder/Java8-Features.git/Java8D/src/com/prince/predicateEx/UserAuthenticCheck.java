package com.prince.predicateEx;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserAuthenticCheck {
	
	public static void main(String[] args) {
		
		
		Predicate<User1> p = u->u.username.equals("vishnu") && u.password.equals("vishnu");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter User Name");
		
		String username = sc.nextLine();
		
		
		System.out.println("Enter password");
		
		String password = sc.nextLine();
		
		User1 user = new User1(username,password);
		
		if(p.test(user)){
			
			System.out.println("Valid USER");
		}
		else{
			System.out.println("Not Valid USER");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
