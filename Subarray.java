//import java.lang.Math;
public class Subarray{
    static int maxSubarraySum(int arr[]){
        int maxSoFar=arr[0];
        int maxEndingHere=arr[0];
        for(int i=0;i<arr.length;i++){
            maxEndingHere=Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar=Math.max(maxSoFar,maxEndingHere);
        }
        return maxSoFar;
    }
    public static void main(String args[]){
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int maxSum= maxSubarraySum(arr);
        System.out.println("maximum sum is"+maxSum);
    }

}