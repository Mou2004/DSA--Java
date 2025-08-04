public class ReverseAnArray {
    //reverse an array
    //swap the extreme indexes
    public static void reverse(int[] array){
        int start = 0;
        int end = array.length-1;
        while (start<end){
            //swap
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
