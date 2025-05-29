// this class represents each node in a linked list
//each node has two attributes that is the data of the node and also the reference to
//the next node(Pointer)
public class Node {
    int data;
    Node next;//next variable pointer
    public Node(int data){
        this.data=data;
        this.next = null; //initialising next node to null, i.e first node isn't pointing to anythig
    }
}
