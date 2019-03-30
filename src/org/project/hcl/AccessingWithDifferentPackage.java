package org.project.hcl;

import org.project.hcl.need.*;


public class AccessingWithDifferentPackage {
	
	public void compName() {
		System.out.println("compName is qwerty");
	}
	
	public void compId() {
		
		System.out.println("compId is 54321");
	}
	
	
	public static void main(String[] args) {
		
		AccessingWithDifferentPackage ci = new AccessingWithDifferentPackage();
		
		ci.compName();
		ci.compId();
		
		AccessingWithDifferentPackageTest bi = new AccessingWithDifferentPackageTest();
		
		bi.empId();
		bi.empName();	
		
	}
}
