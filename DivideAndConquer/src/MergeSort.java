public class MergeSort {
    //mergeSort time complexity= nlogn==inbuilt sort
    //sorting an array into ascending or descending order of elements
    //Approach
    /*
    * 1.Divide-- find the mid of the array
    * 2. MergeSort(left)+MergeSort(right)=sort the left part and right part of the array
    * 3. Combine/Merge the left right solutions
    * */
    public static void mergeSort(int arr[], int si, int ei){
        //basecase
        if (si>=ei){
            return;
        }

        int mid = si+(si-ei)/2;//=(si+ei)/2
        mergeSort(arr,si,mid);//left part
        mergeSort(arr, mid+1,ei);//right part
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid, int ei){
        int[] temp = new int[ei-si+1];
        int i = si;//iterator for left part
        int j = mid+1;//iterator for right part
        int k = 0;//iterator for temp array
        while(i<=mid&&j<=ei){
            if (arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;

            }
            k++;

        }

    }

    public static void main(String[] args) {

    }
}
