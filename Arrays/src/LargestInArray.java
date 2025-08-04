public class LargestInArray {
    //find the largest number in an array
    public static int largest(int array[]){
        int largest = Integer.MIN_VALUE;
        for (int i =0; i<array.length;i++){
            if (array[i]>largest){
                largest=array[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,5};
        System.out.println(largest(array));
    }
}
