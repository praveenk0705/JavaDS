
public class SelectionSort {

	public static void main(String[] args) {
		//int []arr = { 1,4,2,5,3};
		int []arr = {11,12, 9 ,7, 15 ,10 ,1 ,46,34,345,223,563,64,23,42,63,23,52,6,85,8,5,6,7,234,534,56734,534,53,5634,65,345,345,36,345,35,35};
		
		selectSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}

	}

	private static void selectSort(int[] arr) {
		int index = 0;
		for (int i = 0; i < arr.length-1; i++) {
			index =i;
			for (int j = i+1; j <arr.length; j++) {
				
				if(arr[j] < arr[index])
					index = j;
				
			}
			swap(arr ,index,i);
			
		}
		
	}

	private static void swap(int[] arr, int index, int i) {
		int temp =0;
		temp = arr[index];arr[index] = arr[i];arr[i]= temp;
		
	}

}
