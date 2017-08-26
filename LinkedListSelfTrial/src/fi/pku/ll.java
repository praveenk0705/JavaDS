package fi.pku;

import java.util.LinkedList;

public class ll {

	public ll() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/*LinkedList l = new LinkedList();
		l.addAtHead(1);
		l.addAtHead(2);
		l.addAtHead(1);
		l.addAtHead(1);
		
		System.out.println(l);
		*/
		
		LinkedList<String>  l = new LinkedList<String>();
		l.add("A");
		l.add("B");
		l.add(1, "Z");
		System.out.println(l);
		

	}

}
