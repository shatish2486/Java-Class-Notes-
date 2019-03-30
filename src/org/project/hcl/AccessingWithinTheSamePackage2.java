package org.project.hcl;

public class AccessingWithinTheSamePackage2 {

	public void compId() {
		
		System.out.println("compId is 54321");
	}
	
	public void compName() {
		System.out.println("compName is qwerty");
		
	}
	
	public static void main(String[] args) {
		
		AccessingWithinTheSamePackage2 a = new AccessingWithinTheSamePackage2();
		a.compId();
		a.compName();	
		
		AccessingWithinTheSamePackage b= new AccessingWithinTheSamePackage();
		
		b.empId();
		b.empName();
		
	}
}
