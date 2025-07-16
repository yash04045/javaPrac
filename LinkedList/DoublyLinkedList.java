public class DoublyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public static void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void removeFirst(){
        if(size == 0){
            System.out.println("DLL is Empty");
            return;
        }else if(size == 1){
            head = tail = null;
            return;
        }
        head = head.next;
        head.next.prev = null;
        size--;
    }

    public static void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public static void removeLast(){
        if(size == 0){
            System.out.println("Nothing to print");
            return;
        }else if (size == 1){
            head = tail = null;
            size= 0;
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public static void main(String[] args){
        DoublyLinkedList Dll = new DoublyLinkedList();
        Dll.addFirst(1);
        Dll.addFirst(2);
        Dll.addFirst(3);
        Dll.addLast(0);
        printLL();
        removeLast();
        printLL();
        removeFirst();
        printLL();
    }
}
