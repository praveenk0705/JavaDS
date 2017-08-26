package fi.pku;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterators {

	public static void main(String[] args) {


		List<String> li = new ArrayList<String>();
		li.add("Praveen");
		li.add("Kumar");
		li.add("Ujjwal");
		
		ListIterator<String> it = li.listIterator();
		
		while(it.hasNext()){
			//System.out.println(it.next());
			it.next();
		}
		
		
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
		
		System.out.println(li.get(1));

	}

}
