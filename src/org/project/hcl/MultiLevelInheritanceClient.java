package org.project.hcl;

public class MultiLevelInheritanceClient extends SingleInheritanceCompany{
	
	private void client1() {
		System.out.println("client details");

	}
	
	public static void main(String[] args) {
		MultiLevelInheritanceClient mi= new MultiLevelInheritanceClient();
		
		mi.empID();
		mi.empName();
		mi.comID();
		mi.compName();
		mi.client1();
	}

}
