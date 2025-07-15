

public class LLRemoveFirst {
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
            return;            
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
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

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head; 
        for(int i = 0; i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static void main(String args[]){
        LLRemoveFirst ll = new LLRemoveFirst();        
        ll.addFirst(20);        
        ll.addFirst(10);        
        ll.addLast(30);        
        ll.addLast(40);
        ll.addMid(9, 4);
        // ll.printList();
        // System.out.println("The size of Linked List is: "+ll.size);
        ll.removeFirst();
        ll.printList();

        ll.removeLast();
        ll.printList();
        System.out.println(ll.size);

    }    
}
