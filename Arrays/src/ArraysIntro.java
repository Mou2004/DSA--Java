import java.util.Scanner;

public class ArraysIntro {
    public static void main(String args[]) {
        //Arrays are linear data structures - storing elements near to each other in memory
        //each element in the array has a reference address and the value associated with it
        //creating an array

        int marks[] = new int[50];

        int numbers[] = {1, 2, 3};

        int anotherNumbers[] = {4, 5, 6};

        String names[] = {"John", "Thomas", "Alexa"};

        System.out.println(marks[0]);//empty array-so null
        System.out.println(numbers[0]);//1
        System.out.println(anotherNumbers[0]);//4
        System.out.println(names[0]);//John

        //inputing in an array
        Scanner scanner = new Scanner(System.in);
        marks[0]=scanner.nextInt();
        System.out.println(marks[0]);

    }
    public static void update(int marks[]){
        //this function takes an array as an argument
        //updates each element by increasing it by 1
        for (int i =0;i<marks.length;i++){
            marks[i] = marks[i]+1;
        }
    }
}
