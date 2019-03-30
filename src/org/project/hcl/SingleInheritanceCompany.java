package org.project.hcl;

public class SingleInheritanceCompany extends SingleInheritanceEmployee{

	public void comID() {
		System.out.println("COMP Id is 54321");		
		}
		
	public void compName() {
		System.out.println("COMP Name is qwerty");
		}
	
	public static void main(String[] args) {
		
		SingleInheritanceCompany ci = new SingleInheritanceCompany();
		
		ci.empID();
		ci.empName();
		ci.comID();
		ci.compName();
		
	}
}
