import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReverseString {

	public static void main (String []args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String s = br.readLine();
		char []sa = s.toCharArray();		
		int len = sa.length;
		System.out.println(len);
		int first = 0;
		int last = len-1;
		char temp = 0 ;
		
		while(first <= last){
			temp =sa[first] ;
			sa[first]= sa[last];
			sa[last]=temp;
			
			first++;
			last--;
			
		}
		System.out.println(sa);
		
	}
	
}
