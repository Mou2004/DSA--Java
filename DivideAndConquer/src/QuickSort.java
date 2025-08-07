public class QuickSort {

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return; //Base case- if the array has only one element than it is already sorted
        }
        int pivotIndex = partition(arr, si, ei);
        quickSort(arr, si, pivotIndex - 1);//sorting the elements smaller than the pivot(on right side) recursively
        quickSort(arr, pivotIndex + 1, ei); //sorting the elements on left side of the pivot

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];//defining the pivot as the last element of the array
        int i = si - 1; //defining the auxillary pointer
        for (int j = si; j < ei; j++) {//looping through the array with iterator j
            if (arr[j] <= pivot) {
                i++; //increase the auxillary pointer to the space where we need to swap the arr[j] value with
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }


        //insert pivot into its right place
        i++;
        //swap the element at i with the ei(pivot element)
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }


    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int ar[] = {6, 3, 9, 8, 2, 5};
        printArr(ar);

        quickSort(ar, 0, 5);
        printArr(ar);
    }
}
