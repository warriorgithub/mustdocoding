package mustdoprogramming.array;

import java.util.Arrays;

public class MaxSumIncresingSubSequence {
	
	public static void main(String[] args) {
		int orignalArr[] ={1, 101, 2, 3, 100, 4, 5};
		int tempArr[] = new int [orignalArr.length];
		int i=1;
		int j=0;
		int sum=0;
		tempArr[0] = orignalArr[0];
		while(j<i && i< orignalArr.length-1) {
			
			if(orignalArr[j]<orignalArr[i]) {
				sum = tempArr[j]+orignalArr[i];
			}j++;
			
			if(j==i) {
				tempArr[j] = sum;
				sum=0;
				j=0;
				i++;
			}
		}
		
		int max=0;
		for(int k=0;k<tempArr.length;k++) {
			max= Math.max(max, tempArr[k]);
		}
		System.out.println(max);
		
		
	}

}
