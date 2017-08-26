import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Tests {

	public static void main(String[] args) {
		/*Object a = 10.78;
		//System.out.println(a.getClass().getSimpleName());
		
		
		
		Map m = new HashMap<>();
		m.put("Status", "s1");
		m.put("event", "e1");
		
		
		Map m1 = new HashMap<>();
		m1.put("Status", "s11");
		m1.put("event", "e11");
		
		List l = new ArrayList<>();
		
		l.add(m);
		l.add(m1);
		
		
		
		for(int i = 0; i <l.size() ; i++){
			System.out.println(l.get(i));
		}
		
		for(Object mx : l){
			System.out.println(mx);
			
		}
		
		Iterator   iter = l.iterator();
		while (iter.hasNext()){
			//System.out.println(iter.next());
			HashMap mg = (HashMap) iter.next();
			System.out.println(mg);
			*/
			
			
		/*}*/
		
		int []n1  = new int[10];
		int i =0;
		int n = 10;
		while(n/2 >=1){
			n1[i] = n % 2 ;
			n = n/2;
			i++;
		}
		n1[i] = 1;
		
		for(int x : n1)
		System.out.println(n1[x]);
		

	}

}
