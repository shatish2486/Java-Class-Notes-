package org.project.hcl;

public class PolymorphismOverloading {

	public void empid() {
		System.out.println("empID is 12345");
	}
		
	public void empid(int i) {
		
		System.out.println(i);
	}
	
	public void empid(int j, long phno) {
	System.out.println(j+"\n"+phno);
			
	}
	
	public static void main(String[] args) {
		
	PolymorphismOverloading ci=new PolymorphismOverloading();
			
	ci.empid();
	ci.empid(5);
	ci.empid(0,12345);
	
	
	}
	
}
