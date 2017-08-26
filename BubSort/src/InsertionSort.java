
public class InsertionSort {

	public static void main(String[] args) {
		int []arr = {1,4,3,2,5, 18,23,45,22,34,12};
		insertionSort(arr);
	}

	private static void insertionSort(int[] arr) {
		
		int len = arr.length;
		for (int i = 0; i < len-1; i++) {
			for ( int j = i ; j >=0 ; j--){
				
				if(arr[j+1] > arr[j]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
