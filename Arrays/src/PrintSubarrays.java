public class PrintSubarrays {
    public static void printSubarrays(int array[]){
        //print all the continuous parts of the array
        for (int i =0; i< array.length;i++){
            int start =i;
            for (int j =i; j< array.length;j++){
                int end = j;
                for (int k = start; k<=end;k++){
                    System.out.print(array[k]+" ");
                    
                }
                System.out.println(
                );
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] array = {2,4,6,8};
        printSubarrays(array);
    }
}
