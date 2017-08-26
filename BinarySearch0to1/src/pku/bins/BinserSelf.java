package pku.bins;

public class BinserSelf {

	public static void main(String[] args) {
		int []givenarr = { 1 };
		int indexvalue = binarySearch(givenarr , 1); 
		System.out.println(indexvalue);

	}

	private static int binarySearch(int[] a, int i) {
		
		int lo = 0;
		int hi = a.length -1;
		
		while(lo <= hi){
			int mid = lo + (hi -lo)/2;
			
			if(a[mid] == i)
				return mid;
			else if (a[mid] > i)
				hi = mid -1;
			else
				lo = mid+1;
			
		}
		
		
		
		return -1;
	}

}
