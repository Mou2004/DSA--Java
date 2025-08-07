public class MergeSort {
    //mergeSort time complexity= nlogn==inbuilt sort
    //sorting an array into ascending or descending order of elements
    //Approach
    /*
    * 1.Divide-- find the mid of the array
    * 2. MergeSort(left)+MergeSort(right)=sort the left part and right part of the array
    * 3. Combine/Merge the left right solutions
    * */
    public static void mergeSort(int arr[], int startIndex, int endIndex){
        //basecase i.e  when the array has one or less elements
        if (startIndex>=endIndex){
            return; //1 element is already sorted
        }

        int mid = startIndex    +(startIndex-endIndex)/2;//=(si+ei)/2; use this when si and ei are small, large values the first formula is better
        mergeSort(arr,startIndex,mid);//sort left part
        mergeSort(arr, mid+1,endIndex);//sort right part
        merge(arr,startIndex,mid,endIndex);// merge both parts by comparing each element
    }

    //this method merges the sorted parts
    public static void merge(int arr[],int startIndex,int mid,  int endIndex){
        int[] temp = new int[endIndex-startIndex+1];//size of the temp array would ei-si+1, cause array indexing starts at 0
        int i = startIndex;//iterator for left part
        int j = mid+1;//iterator for right part
        int k = 0;//index iterator for temp array
        while(i<=mid&&j<=endIndex)// iterating till the end of both left and right parts
            {
            if (arr[i]<arr[j]){ //comparing the corresponding index elements of the right and left parts
                temp[k]=arr[i]; //storing the smaller element in the temp array
                i++;
            }else{
                temp[k]=arr[j];
                j++;

            }
            k++;

        }
        //for leftover elements of the first sorted part
        while(i<mid){
            temp[k++]=arr[i++];
        }

        //for leftover elements of 2nd sorted part
        while(j <= endIndex) {
            temp[k++] = arr[j++];
        }

        //copy temp to original array
        for(k=0, i=startIndex; k<temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
