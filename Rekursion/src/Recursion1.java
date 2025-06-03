public class Recursion1 {

    public static void main(String[] args) {
        printDecreasing(10);
        printIncreasing(5);
        System.out.println(Factorial(5));
        System.out.println(sum(5));
        System.out.println(Fibonacci(5));
        int[] array = {1,2,3,1,2,3,3};
        System.out.println(lastOccurence(array,1,6));
    }
    //print numbers in decreasing order from n to  0

    public static void printDecreasing(int n) {
        //define base case
        if (n == 0) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecreasing(n - 1);
    }

    //print numbers in increasing order to 1 to n
    public static void printIncreasing(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        printIncreasing(n - 1);
        System.out.println(n);
    }

    //print factorial of a number n

    public static int Factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * Factorial(n - 1); //assumption that the function works for (n-1)

    }

    //print sum of n natural numbers
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    //print the nth fibonacci number
    public static int Fibonacci(int n) {
        //defining the base case
        if (n == 0 || n == 1) {

            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    //check if a given array is sorted
    public static boolean checkSorted(int[] arr, int i) {
        if (i==arr.length-1){
            return true;
        }
        if (arr[i] > arr[i + 1]) {

            return false;
        }
        else {
            return checkSorted(arr, i + 1);
            //or i++
            // return checkSorted(arr, i); less clean of a code
        }
    }
    //write a function to find the first occurence of an element in an array?
    public static int firstOccurence(int[] arr, int number, int index){
        if (arr[index]==number){
            return index;
        }
        if (index==arr.length-1){
            return -1; //this means the array is finished and no number found
        }
        return firstOccurence(arr,number,index+1);
    }
    //write a function to find the last occurence of an element in an array?
    //ToSelf- revise the implementation in AC once- the logic is different there
    public static int lastOccurence(int[] arr, int number, int index){
        if (arr[index]== number){
            return index;
        }
        if (index<0) {
            return -1;
        }


        return lastOccurence(arr, number, index-1);
    }

    //print x^n
    public static int power(int base, int power){
        if (power==0){
            return 1;
        }
        return base*power(base, power-1);
    }

    //print x^n optimised function--

}
