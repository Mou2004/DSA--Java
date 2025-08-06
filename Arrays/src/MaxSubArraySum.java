public class MaxSubArraySum {
    //Problem Statement:
    //Given an integer array, find the contiguous subarray (containing at least one number) which has the largest sum
    // and return its sum.

    //brute force-find all the possible subarrays and calculate their sum and find the largest sum
    public static int max(int[] arr){
        int maxSum = Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++){
            for (int j=i;j< arr.length;j++){
                int sum = 0;
                for (int k=i; k<=j;k++){
                   sum +=arr[k];
                }
                if (maxSum<sum){
                    maxSum=sum;
                }

            }
        }
        return maxSum;

    }


    //Prefix Sum
    //create a new prefix array and store the sum from 0th till i--th element as individual elements  in that array
    //then the subarray sum of i to j, is prefix[j]-prefix[i-1]
    //separate test case for array if all elements are negative




    //Kadane's Algorithm


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(max(arr));
    }
}
