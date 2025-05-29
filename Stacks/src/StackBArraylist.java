//implementation of Stacks using Arraylist

import java.util.ArrayList;

public class StackBArraylist
{
    private ArrayList<Integer> stack;
    public StackBArraylist(){
        this.stack = new ArrayList<>();
    }
    //implement the functions, push,pop, peek,empty etc
    //isEmpty??
    public boolean isEmpty(){
        return this.stack.size()==0; //this.stack.isEmpty();
    }

    //push
    public void push(int value){
        this.stack.add(value);
    }
    //peek
    public int peek(){
        //check if stack is empty
        if (this.stack.isEmpty()){
            return -1;
        }
        int length = this.stack.size();
        return stack.get(length-1);
    }
    //pop returns the top and removes it
    public int pop(){
        //check if stack is empty
        if (this.stack.isEmpty()){
            return -1;
        }
        int length = this.stack.size();
        int top = this.stack.get(length-1);
        this.stack.remove(length-1);
        return top;
    }

    /*public static void main(String[] args) {
        Stack s = new Stack<>();
        s.push(1);
        s.push(2);

    }*/
}
