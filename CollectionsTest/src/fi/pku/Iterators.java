package fi.pku;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Iterators {

	public static void main(String[] args) {


		//ArrayList<String> ar = new ArrayList<String>();
		String removeStr = "Praven";
		List<String> ar = new ArrayList<String>();
		
		ar.add("Praveen");
		ar.add("Kumar");
		ar.add("Ujjwal");
		
		Iterator<String> itr = ar.iterator();
		while(itr.hasNext()){
			if (removeStr.equals(itr.next())) {
				itr.remove();
				
			}
			//System.out.print(itr.next() + " ");
		}

		System.out.println(ar.get(1));
	}

}
