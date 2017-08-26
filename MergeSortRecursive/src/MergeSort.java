
public class MergeSort {

	public static void main(String[] args) {
		int []arr = {1,3,2,5,4};
		mergeSortTest(arr);

		for(int i : arr){
			System.out.println(i);
		}
	}
	private static void mergeSortTest(int[] arr){
		int start =  0;
		int end = arr.length -1 ;
		mergeSort(arr, start, end);
		

	}
	private static void mergeSort(int[] arr, int start, int end) {
		if(start <end){
			int middle = (int) Math.floor((start+end)/2);
			mergeSort(arr, start, middle);
			mergeSort(arr, middle+1, end);
			merge(arr,start,middle,end);
		}
		
		
	}
	private static void merge(int[] arr, int start, int middle, int end) {
		int n1 = middle -start +1;
		int n2 = end -middle;
		int []left = new int[n1] ;
		int right[] = new int[n2];
		for (int i = 0; i < n1-1; i++) {
			left[i] = arr[start+1];
		}
		
		for (int i = 0; i < n2-1; i++) {
			right[i]= arr[middle + 1 + i];
		}
		
		
		int i =0; int j =0;
		for (int k = start; k < end; k++) {
			if(left[i] <= right[j]){
				arr[k] = left[i];
				i += 1;
			}
			else {
				arr[k] = right[j];
				j +=1;
			}
			
		}
	}

}
