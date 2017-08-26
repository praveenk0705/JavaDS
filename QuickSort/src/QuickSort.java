
public class QuickSort {

	public static void main(String[] args) {
		int []arr = {2,5,1,3,4};
		//int []arr = {11,12, 9 ,7, 15 ,10 ,1 ,46,34,345,223,563,64,23,42,63,23,52,6,85,8,5,6,7,234,534,56734,534,53,5634,65,345,345,36,345,35,35};
		int start = 0;
		
		int end = arr.length-1;
		for (int i : arr) {
			System.out.println(i);
		}

		quickSort(arr, start, end);
		
		for (int i : arr) {
			System.out.println(i);
		}

	}

	private static void quickSort(int[] arr, int start, int end) {
		
		
		
		
		if(start < end) {
		int pivot = partition(arr, start,end);
		quickSort(arr, start, pivot-1);
		quickSort(arr, pivot+1, end);
		
		}
		
		
	}

	private static int partition(int[] arr1, int start1, int end1) {
		int pivot = arr1[end1];
		int i = start1;
		for (int j = start1; j <end1; j++) {
			if (arr1[j] <=pivot){
				
				int temp = arr1[i];
				arr1[i] = arr1[j];
				arr1[j] = temp;
				i= i +1;
			}
			
			
		}
		
		int temp = arr1[i];
		arr1[i] = arr1[end1];
		arr1[end1] = temp;
		return i;
	}

	

	
}
