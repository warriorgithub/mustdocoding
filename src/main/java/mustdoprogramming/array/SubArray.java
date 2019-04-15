package mustdoprogramming.array;


//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0
public class SubArray {


    private void subArray(int arr[],int givenSum){
        if(arr.length==0) return;
        int sum=0;
        int j=0;
        int i = 0;
        for(;i<arr.length;i++){
            sum = sum+arr[i];
            while(sum>givenSum ){
                sum=sum-arr[j];
                j++;
            } if(sum==givenSum){
                System.out.println("found between " + j +"  and  "+i);
            }
        }
    }

    public static void main(String[] args) {
        //int arr[] = {1,4,20,3,10,5};
        //int arr[] = {1,2,3,7,5};
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        new SubArray().subArray(arr,15);
    }
}
