public class PrintPairs {
    public static void printPairs(int[] array){
        for (int i=0;i<array.length;i++){//n times
            int current = array[i];
            for (int j=i+1;j< array.length;j++){//n times
                System.out.print("("+ array[i]+","+array[j]+")");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] array = {2,4,6,8,10};
        printPairs(array);

    }
}
