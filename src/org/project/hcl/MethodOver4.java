package org.project.hcl;

public class MethodOver4 {
	
	public void empId(int a ,float b) {
	
		System.out.println("integer "+a +" float "+ b);

	}
	
	public void empId(String name, long phone) {
		
		System.out.println("string name "+ name + " long phone "+phone);
		
	}

	public static void main(String[] args) {
		MethodOver4 ci = new MethodOver4();
		ci.empId(1234, 5.30f);
		ci.empId("shatish", 8148002900l);
	}
}
