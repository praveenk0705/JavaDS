package pku.bins;

public class Bubsort {

	public static void main(String[] args) {


		int arr[] = { 1,4,3,5,8,34,12,23};
		
		bubSort(arr);

	}

	private static void bubSort(int[] arr) {
		int len = arr.length;
		
		for (int i =0 ; i < len-1 ; i++){
			for (int j = 1; j<(len-i); j++){
				 if(arr[j-1] > arr[j]){  
                     //swap elements  
                     int temp = arr[j-1];  
                     arr[j-1] = arr[j];  
                     arr[j] = temp;  
             }  
				
			}
		}
		for(int x=0; x< len; x++)
		System.out.println(arr[x]);
		
	}

}
