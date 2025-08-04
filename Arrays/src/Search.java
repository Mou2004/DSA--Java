public class Search {
    //Search is to find a certain key/value in the array
    //Linear Search- simple iterative approach by going through each element of the array
    public static int linearSearch(int[] array, int key){
        for (int i =0; i< array.length;i++){
            if (array[i]==key){
                return i;
            }
        }
        return -1; //if the key is not found return -1;
    }
    //Binary  Search
    //First find the mid and then compare the mid, if the mid is larger search on the left part, else right part and repeat
    public static int BinarySearch(int[] array, int key){
        int start = 0;
        int end = array.length -1;

        while(start<=end){
            //first find the mid
            int midIndex = (end+start)/2;
            int mid = array[midIndex];

            //compare the mid
            if (mid==key){
                return midIndex;
            }
            if(mid>key){
                end=midIndex-1;
            }
            if (mid<key){
                start=midIndex+1;
            }

        }
        return -1;
    }
    public static void reverseArray(int[] arr){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    //print pairs
    public static void PrintPairs(int[] array){
        for (int i=0;i<array.length;i++){ //n times
            int current = array[i];
            System.out.println(current);
            for (int j=i+1;j< array.length;j++){ //n times
                System.out.print(current+","+array[j]);
                System.out.print(" ");
            }
            System.out.println();

        }
        //total pairs in the n-elements arrays= 1+2+3....+(n-1)== n(n-1)/2--AP formula
        //time complexity o(n^2)
    }
    public static void PrintSubarrays(int[] array){
        int totalSubarrays=0;
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        int minSum= Integer.MAX_VALUE;
        for (int i=0;i<array.length;i++){ //n times
            int current = array[i];
            for (int j=i;j< array.length;j++){ //n times
                int end = array[j];
                for (int k=i;k<=j;k++){
                    System.out.print(array[k]+ " ");
                }
                sum+=array[j];
                totalSubarrays++;
                System.out.print("Sum: "+sum);
                if (sum>maxSum){
                    maxSum=sum;

                }
                System.out.println();
            }
            System.out.println("Max"+maxSum);

            System.out.println();

        }
        System.out.println("Total number of Arrays: "+ totalSubarrays);
        //total subarrays= n(n+1)/2==1+2+3+....n
        //the above sum calculate is brute force method-O(n^3) there are better optimized methods to calculate the sum
    }

    //More Array Problems
    public static void maxSubarraySum(){

    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(BinarySearch(array,5));
        //PrintPairs(array);
        PrintSubarrays(array);
        //reverseArray(array);

        

    }

}
