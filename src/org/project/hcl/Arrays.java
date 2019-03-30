package org.project.hcl;

public class Arrays {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 100;
		a[1] = 110;
		a[2] = 120;
		a[3] = 130;
		a[4] = 140;

		int b = 0;
		for (int i = 0; i < a.length; i++) {

			int sum = a[i];
			int temp = sum;
			temp = b;
			b = sum+temp;
		



		}
		System.out.println("b value" + b);
	}

}
