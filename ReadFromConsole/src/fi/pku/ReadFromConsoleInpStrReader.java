package fi.pku;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsoleInpStrReader {

	public static void main(String[] args) {
		InputStreamReader isr=new InputStreamReader(System.in);  
		BufferedReader br=new BufferedReader(isr);  
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Here you declare your BufferedReader object and instance it.
        System.out.println("Radius?"); */
		System.out.println("Enter your name");  
		String name = null;
		try {
			name = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		System.out.println("Welcome "+name);  

	}

}
