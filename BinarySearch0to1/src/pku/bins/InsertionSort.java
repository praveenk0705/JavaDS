package pku.bins;

public class InsertionSort {

	public static void main(String[] args) {

		int listToSort[] = {1,5,3,8,7,4};
		insertionSort(listToSort);

	}

	private static void insertionSort(int[] listToSort) {
		for (int i = 0; i < listToSort.length -1; i++) {
			System.out.println("i value" + i);
			for (int j =i +1; j > 0; j--) {
				System.out.println("j value ######" + j);
				if (listToSort[j] > listToSort[j-1]) {
					swap (listToSort , j , j-1);
					
				}
				else
					break;
				
				}
				
				
			}
		for (int j2 = 0; j2 < listToSort.length; j2++) {
			System.out.println(listToSort[j2]);
		}
		
	}

	private static void swap(int[] listToSort, int j, int i) {
		int temp = listToSort[j];
		listToSort[j] = listToSort[j-1];
		listToSort[j-1] = temp;
		
	}

}
