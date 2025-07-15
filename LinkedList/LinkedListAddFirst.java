

public class LinkedListAddFirst {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //create a new node(create a obj).
        Node newNode = new Node(data);
        //Base case if the link list is empty
        if(head == null){
            head = tail = newNode;
            return;
        }           

        //step 2 - newNode = head.
        newNode.next = head;  //link (My newnode now points towards my old head)

        //step 2 - head = newNode
        head = newNode;

    }
    public static void addLast(int data){
       
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }      
        tail.next = newNode;
        tail = newNode;
    }
    
    public static void printList(){
         if(head == null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        LinkedListAddFirst ll = new LinkedListAddFirst();
        ll.printList();
        ll.addFirst(20);
        ll.printList();
        ll.addFirst(10);
        ll.printList();
        ll.addLast(30);
        ll.printList();
        ll.addLast(40);
        ll.printList();
    }
}
