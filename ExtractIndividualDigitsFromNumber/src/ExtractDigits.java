import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class ExtractDigits {

	public static void main(String[] args) {


		Scanner sn = new Scanner(System.in);

		System.out.println("enter digits");
		int n = sn.nextInt();
		LinkedList<Integer> stack = new LinkedList<Integer>();
		
		while(n >0){
			stack.push(n%10);
			n= n/10;
			
		}
		while (!stack.isEmpty())
			System.out.print(stack.pop() + "  ");
	}

	
}
