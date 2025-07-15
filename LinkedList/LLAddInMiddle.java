import java.util.*;

public class LLAddInMiddle {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null ;
        }    
    }
    public static Node head;
    public static Node tail;
    public static int size;  // track the size of the linked List throughout the code.

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;            
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addMid(int data, int indx){
        Node newNode = new Node(data);
        if(indx == 0){
            addFirst(data);
            return;
        }
        size++;
        Node temp = head;
        int i = 0;
        while(i < indx - 1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        LLAddInMiddle ll = new LLAddInMiddle();
        
        ll.addFirst(20);
        
        ll.addFirst(10);
        
        ll.addLast(30);
        
        ll.addLast(40);
        ll.addMid(9, 4);
        ll.printList();
        System.out.println("The size of Linked List is: "+ll.size);
    }

}
