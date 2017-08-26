
public class Test {

	public static void badSwap(int var1, int var2)
	{
	  int temp = var1;
	  var1 = var2;
	  var2 = temp;
	  System.out.println(var1 + "" + var2);
	}
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = 20;
		System.out.println(v1 + "" + v2);
		badSwap(v1,v2);
		System.out.println(v1 + "" + v2);
		System.out.printf("%s" , "10");
		
		

	}

	
}
