package fi.pku;

import java.util.Scanner;

public class ReadFromConsoleScanner {

	public static void main(String[] args) {
		try {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("enter an integer");
			int myint = keyboard.nextInt();
			System.out.println(myint);
			keyboard.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
