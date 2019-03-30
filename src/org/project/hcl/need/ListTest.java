package org.project.hcl.need;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		
		List<Integer> ni = new ArrayList<Integer>();
		List li = new ArrayList();
		li.add(10);
		li.add(20);
		li.add(30);
		System.out.println(li);
		ni.addAll(li);
		System.out.println(ni);
		ni.add(100);
		boolean checkli = ni.contains(40);
		System.out.println(checkli);
		li.clear();
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(60);
		boolean checkni = li.contains(50);
		System.out.println(checkni);
		System.out.println(li);
		System.out.println(ni);
		//boolean retainAll1 = li.retainAll(ni);
		//System.out.println(retainAll1);
		//.boolean remove = ni.removeAll(li);
		//System.out.println(remove);
		System.out.println(li.indexOf(50));
		System.out.println(li.lastIndexOf(60));
		li.remove(2);
		System.out.println(li);
		
	}
	
	
		
		
		
		
		
		
	
}
