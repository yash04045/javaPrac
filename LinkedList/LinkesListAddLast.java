

public class LinkesListAddLast {
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

    public static void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }      
        tail.next = newNode;
        tail = newNode;
    }
    public static void main(String args[]){
        LinkesListAddLast ll = new LinkesListAddLast();
        ll.addLast(20);
        ll.addLast(2);
    }
}
