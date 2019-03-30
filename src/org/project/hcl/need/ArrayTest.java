package org.project.hcl.need;

public class ArrayTest {
	
	public static void main(String[] args) {
	 
		int a[] = new int[10];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;
		a[6] = 7;
		a[7] = 8;
		a[8] = 9;
		a[9] = 10;
		
		float b = 0;
		
		for (int i = 0; i < a.length; i++) {
		int c = a[i];
		float temp = c;
		temp = b;
		b = temp + c;
		
				}
		
		System.out.println(b); 
		System.out.println(a.length);
	
	double avg = b/ a.length;
	
	System.out.println(avg);
	
	}
	

}
