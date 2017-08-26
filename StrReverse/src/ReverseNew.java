
public class ReverseNew {

	public static void main(String[] args) {
		String word = "  praveen kumar ujjwal wrtert retet wrtert   ";
		reversewords(word);
	}
	
	
		
	
	


	private static void reversewords(String word) {

		String  s= word;
		int start = 0;
		int end = s.length() -1;
		char []sa = s.toCharArray();
		reverse1(sa ,start , end);
		//System.out.println("length" + end);
		
		int startWordIndex = 0;
		int endWordIndex = 0;
		int i =0;
		int j = 0;
		
	for (i = 0 ; i <= end ; i= i+j){
		while(sa[j] == ' '){
			j++;
			/*if(j > end){
				
				break;
			}*/
		}
		
		startWordIndex = j;
		while(sa[j] != ' '  ){
			j++;
		/*	if(j > end){
				System.out.println("breaking code here");
				break;
			}*/
				
			
		}
		endWordIndex = j-1;
			
			reverse1(sa , startWordIndex, endWordIndex);
			/*if(endWordIndex >= end)
				break;*/
			System.out.println("final i value" + i);
		}
			
		System.out.println(sa);
	
		
	}







	private static void reverse1(char[] sa , int start , int end) {
		
		
		int first = start;
		int last = end;
		while(first <= last){
			char temp = sa[first] ;
			sa[first]= sa[last];
			sa[last]=temp;
			
			first++;
			last--;
		}
		//System.out.println(sa);
		
		
	}

}
