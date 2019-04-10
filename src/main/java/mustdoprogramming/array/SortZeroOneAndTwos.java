package mustdoprogramming.array;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0


public class SortZeroOneAndTwos {

	public static void main(String[] args) {

		int arr[] = {0,2,1,2,0};
		if(arr.length==0) return;
		int low=0;
		int mid=0;
		int high=arr.length-1;
		int temp=0;

				while(mid<high) {
					switch(arr[mid]) {
					case 0:
						temp = arr[low];
						arr[low] = arr[mid];
						arr[mid] = temp;
						low++;
						mid++;
						break;
					case 1:
						mid++;
						break;
					case 2:
						temp = arr[mid];
						arr[mid] = arr[high];
						arr[high]= temp;
						high--;
						break;
					}
					System.out.println(Arrays.toString(arr));
				}
	}
}
