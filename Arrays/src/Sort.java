public class Sort
    //various sorting algorithms on arrays
{
    //bubble sort
    //push large elements towards the en
    // d of the array by pushing swapping with adjacent elements
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
    //select the smallest(or largest) element from the array and push it to the beginning by swapping
    public static void SelectionSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){//in SS we don't need to check the last element in the outerloop, by the time we have placed the corrdct values at all other positions, the last element is automatically in correct spot
            int minPos =i;
            //find min in the remaining elements after i
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
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<arr.length;i++){
            largest= Math.max(largest,arr[i]);
        }
        int newArr[] = new int[largest+1];//index starts from 0
        for (int i=0;i< newArr.length;i++){
            newArr[arr[i]]++;
        }
        //Sorting
        int j=0;
        for (int i =0;i<newArr.length;i++){
            while(newArr[i]>0){
                arr[j] =i;
                j++;
                newArr[i]--;
            }
        }
    }

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
