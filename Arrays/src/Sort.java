public class Sort
    //various sorting algorithms on arrays
{
    //bubble sort
    //push large elements towards the end of the array by pushing swapping with adjacent elements
    public static void BubbleSort(int[] arr){
        for(int turns=0;turns< arr.length-1;turns++){


            for (int i =0;i< arr.length-1-turns;i++){

                if (arr[i]>arr[i+1]){
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    //printArray(arr);
                    //System.out.println();
                }

            }
            //System.out.println("----");
            //printArray(arr);

        }

    }

    //SelectionSort
    public static void SelectionSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            //find min in the remaining elements after i
            int minPos =i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    //countingSort descending



    //Insertion Sort
    public static void insertionSort(int[] arr){
        for (int i=1;i < arr.length;i++){
            int curr = arr[i];
            int prev = arr[i-1];
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]= arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    //insertionSort descending


    //CountingSort



    //CountingSort descending

    public static void printArray(int[] arr){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }



    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        SelectionSort(arr);
        printArray(arr);
    }
}
