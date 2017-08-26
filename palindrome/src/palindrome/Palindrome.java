package palindrome;

public class Palindrome {

	public Palindrome() {
		// TODO Auto-generated constructor stub
	}

	public static boolean istPalindrom(char[] word){
	    int i1 = 0;
	    int i2 = word.length - 1;
	    while (i2 > i1) {
	        if (word[i1] != word[i2]) {
	            return false;
	        }
	        ++i1;
	        --i2;
	    }
	    System.out.println("dfgdg");
	    return true;
	}

	public static void main(String[] args) {
		char [] a = {'a', 'n' , 'a'};
		istPalindrom(a);

	}

}
