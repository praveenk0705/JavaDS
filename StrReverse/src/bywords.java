
public class bywords {

	public static void main(String[] args) {
		String str = "praveen kumar ujjwal";
	    String temp = "";
	    String finalString = "";
	        for(int i =str.length()-1;i>=0;i--){
	           if(i!= 0){
	            	temp+= str.charAt(i);
	            }
	            else
	            	temp+= str.charAt(i) + " ";
	           
	           System.out.println(temp);
	           
	            if(str.charAt(i) == ' '||i==0){                            
	            	for(int j=temp.length()-1;j>=0;j--){
	                    finalString += temp.charAt(j);
	                }
	                temp = "";
	            }
	        }
	            System.out.println(finalString);

	}

}
