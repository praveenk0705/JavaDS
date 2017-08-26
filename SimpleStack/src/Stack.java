
public class Stack {
	static class stk{
	int top = -1;
	int []items = new int[100];
	
	public void push(int element){
		if(top == 99){
			System.out.println("overflow");
			
		}
		else{
			items[++top] = element ;
			
		}
		
	}
	public int pop(){
		if (top == -1){
			System.out.println("underflow");
			return '\0';
		}
		else{
			int val = items[top] ;
			top --;
			return val;
		}
	}
	}
	
	public static void main(String[] args) {
		stk s = new stk();
		s.push(12);
	System.out.println(s.items[s.top]);	
	}

}