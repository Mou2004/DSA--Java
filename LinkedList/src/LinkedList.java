//implementing LinkedList
public class LinkedList {
//linkedList always stores the Head and tail separately
   //the structure is chain like= Node1(Head)-->Node2-->Node3-->Node4(tail)
    Node head;
    Node tail;
    int size=0;


    public void addFirst(int data){
        //step1-create new Node
        Node newNode = new Node(data);

            //if there is no node in the LL
            if (head==null){
                head = tail=newNode;
                size++;
                return;
            }

        //step2- newNode next = head
        newNode.next=head; //linking the new node to the head.. NewNode-->Head

        //step3- head=newNode
        this.head = newNode;
        //addFirst is O(1) that is constant-no loop, nothing only 3 steps so constant bigO

        this.size++;
    }

    //adding node to the end of the LinkedList
    //complexity- O(1)
    public void addLast(int data){
       Node newNode = new Node(data);
       //checking if the LL is empty- a LL is empty when the head is null
       if (head==null){
           head=tail=newNode;
           size++;
           return;
       }

       tail.next = newNode;

       this.tail = newNode;
        this.size++;
    }

    //Printing a LinkedList
    public void printList(){
       //iterating over the List using a temporary Node
       Node temp = head;
       while(temp!=null){
           System.out.print(temp.data+"->");
           temp = temp.next;
       }
        System.out.println("");

    }

    //adding a node in middle of a LinkedList
    public void add(int index, int data){
        if(index==0){
            addFirst(data);
            size++;
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;//counter for index
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        //i=index-1; temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    //size of a linkedlist
    public int size(){
        return this.size;
    }

    //removing the first node from the LL
    public int removeFirst(){
        if (size==0){
            System.out.println("List empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if (size==0){
            System.out.println("List empty");
            return Integer.MIN_VALUE;
        }
        if (size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //size>1-here we need to loop through the list to find out the second last Node
        //second last index=size-1
        Node temp = head;//initialising the temp(representing prev node) with head
        for (int i=0;i<size-2;i++){
            temp=temp.next;
        }
        int val = tail.data;//tail.data=temp.next.data
        temp.next=null;
        size--;
        tail=temp;
        return val;
    }
    public int iterativeLinearSearch(int val){
        //search for a key(value) in a LL and return the position where it is found
        //if not found return -1, using iteration
        //loop through the list with a temp NOde

        Node temp = head; //initialize
        for (int i=0;temp!=null;i++){
            if (temp.data==val){
                return i;
            }
            temp=temp.next;

        }
        return -1;
    }

    public int rekursiveSearch(int val){
        //search for a key(value) in a LL and return the position where it is found
        //if not found return -1, using rekursion
        //loop through the list with a temp Node
        return rekursionHelper(head,val);

    }
    //helper function for rekursion, this is where actual rekurion happens
    //O(n)
    public int  rekursionHelper(Node head, int key){
        if (head==null){
            return -1;//base case
        }
        if (head.data==key){
            return 0;
        }
        //tracking the indexes
        int index = rekursionHelper(head.next,key);
        if (index==-1){
            return -1;
        }
        return index+1;
    }
    //imp-reverse a linkedList using Iteration
    public LinkedList reverseList(){
        Node temp = head;
        LinkedList resultList = new LinkedList();
        for (int i=0;temp!=null;i++){
            resultList.addFirst(temp.data);
            temp=temp.next;
        }
        return resultList;
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.printList();
        System.out.println(list.size());
        list.addFirst(2);
        list.printList();
        System.out.println(list.size());
        list.addFirst(1);
        list.printList();
        System.out.println(list.size());
        list.addLast(3);
        list.printList();
        System.out.println(list.size());
        list.addLast(4);
        list.printList();
        System.out.println(list.size());
        LinkedList reverse =list.reverseList();
        reverse.printList();
    }
}
