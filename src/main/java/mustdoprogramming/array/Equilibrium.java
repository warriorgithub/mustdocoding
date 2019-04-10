package mustdoprogramming.array;

//https://practice.geeksforgeeks.org/problems/equilibrium-point/0

public class Equilibrium {
	 
	public static void main(String[] args) {
		
		//int arr [] = {-7, 1, 5, 2, -4, 3, 0};
		int arr[] = {1,3,5,2,2};
		
		int i=0;
		int j=arr.length-1,leftSum=0,rightSum=0;
		
		while(i<=j) {
			if(i==j && leftSum==rightSum) {
				System.out.println(i);
				break;
			}
			leftSum+=arr[i];
			rightSum+=arr[j];
			i++;
			j--;
			
		}
	}
}
