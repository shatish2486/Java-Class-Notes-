package org.project.hcl;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		
		//scanner class creation 
		// Scanner <objname> = new scanner (system.in);
		
		Scanner ci=new Scanner (System.in);
		
		System.out.println("Please enter the name");
		
		String l = ci.nextLine();
		System.out.println("Your Name is "+l);
		
		System.out.println("Enter your ID");
		
		int i = ci.nextInt();
		
		System.out.println("your Id is " +i);
		
		ci.close();
		
		
	}

}
