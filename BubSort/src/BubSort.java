
public class BubSort {

	public static void main(String[] args) {
		int [] arr = {1,3,5,2,4};
		bubSort(arr);

	}

	private static void bubSort(int[] arr) {
		
		for(int i = 0 ; i <= arr.length -1 ; i++){
			for (int j = 1 ; j< (arr.length-i) ; j++){
				if(arr[j] < arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
		
		
	}

}
