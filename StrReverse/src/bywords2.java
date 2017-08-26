import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class bywords2 {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		
		
		System.out.println("enter string");
		
		String st = s.nextLine();
		char []stc = st.toCharArray();
		int len = st.length();
		int index =len -1;
		String temp = "";
		String finals ="";
		
		while(index >=0){
			if(index >0)
			temp+= stc[index];
			
			else
				temp += stc[index]+ " ";
			 
			
			if(stc[index] == ' ' || index == 0){
				int i = temp.length() -1;
				char[] tempc = temp.toCharArray();
				while(i >=0 ){
				finals += tempc[i];
				i-- ;
				}
				temp ="";
			}
			index-- ;
		}
		System.out.println(finals);

	}

}
