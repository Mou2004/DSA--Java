public class StackLL {
    //stack implementatino using LL
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
       static Node head = null;
       public static boolean isEmpty(){
           return head==null;
       }
       //push
        public static void push(int value){
            Node newNode = new Node(value);//creating the newNode
           if (isEmpty()){//if stack is empty, then then the newNode is head
               head= newNode;
           }
           //if elements exists, then first the newNode next is head, then head is newNode
           newNode.next=head;
           head=newNode;

        }

        //pop
        public static int pop(){
           if (isEmpty()){
               return -1;
           }
           Node temp = head;
           head = head.next;
           return temp.data;
        }

        //peek
        public static int peek(){
           if (isEmpty()){
               return -1;
           }
           return head.data;
        }
    }
}
