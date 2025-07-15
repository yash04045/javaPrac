public class ReverseLL {
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
    public static int size;

    public void add(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;            
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printLL(){
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
            
        }
        System.out.println("null");
    }

    public void reverse(){ // time complexity O(n).
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String args[]){
        ReverseLL ll = new ReverseLL();
        ll.add(4);
        ll.add(8);
        ll.add(9);
        ll.add(15);
        ll.add(18);
        ll.printLL();

        ll.reverse();
        ll.printLL();

    }
}
