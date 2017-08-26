package fi.pku;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserControlledConsoleInpStrReader {

	public static void main(String[] args) {
		 InputStreamReader r=new InputStreamReader(System.in);  
		 BufferedReader br=new BufferedReader(r);  
		  
		 String name="";  
		  
		  try {
			while(!name.equals("stop")){  
			   System.out.println("Enter data: ");  
			   name=br.readLine();  
			   System.out.println("data is: "+name);  
			  }  
			  
			 br.close();  
			 r.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  

	}

}
