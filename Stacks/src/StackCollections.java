import java.util.*;

public class StackCollections {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();//has peek,push,pop all the methods
        s.push(1);
        s.push(2);
        s.push(3);
        String string = "abc";
        System.out.println(reverseString(string));




    }
    //push to the bottom of stack
    public static void pushAtBottom(Stack<Integer> s, int item){
        if (s.isEmpty()){
            s.push(item);
            return;
        }
        int top = (int)s.pop();
        pushAtBottom(s,top);
        s.push(top);
    }

    //reverse a string using stack
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int index= 0;
        int lenght = str.length();
        while(index<str.length()){
            char c = str.charAt(index);
            s.push(c);
            index++;
        }
        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            result.append(s.pop());
        }

        return result.toString();
    }
    //reverse a stack-using rekursion
    public static Stack reverseStack(Stack<Integer> s){
        if (s.isEmpty()){
            return s;
        }
        return s;
    }
}
