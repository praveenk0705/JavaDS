package pku.bins;

public class binarySearch {

	public static int search(int[] sortedList, int number){
		int min = 0;
		int max = sortedList.length - 1;
		while (min <= max){
			int mid = min + (max -min) /2;
			System.out.println(mid);
			if (sortedList[mid] == number){
				return mid;
			}
			if (sortedList[mid] > number){
				max = mid -1;
			}
			else{
				min = mid +1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {1,2,3,4,5,6,7,8};
		int res = search(arr, 7);
		//System.out.println(res);

	}

}
