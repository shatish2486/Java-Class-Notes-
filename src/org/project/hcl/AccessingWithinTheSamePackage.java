package org.project.hcl;

public class AccessingWithinTheSamePackage {

	public void empId() {
		
		System.out.println("empId is 12345");
	}
	
	public void empName() {
		System.out.println("empName is shatish");
		
	}
	
	public static void main(String[] args) {
		
		AccessingWithinTheSamePackage a = new AccessingWithinTheSamePackage();
		
		a.empId();
		a.empId();
			}
}
