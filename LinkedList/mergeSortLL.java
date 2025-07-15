import java.util.LinkedList;

public class mergeSortLL {
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

    private static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static Node merge(Node head1, Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }

        }

        while(head1!=null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2!=null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }
    public static Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        //find mid
        Node mid = getMid(head);        
        //left half & right half
        Node rightHead = mid.next; 
        Node lefthead = head;       
        mid.next = null; 
        Node newLeft = mergeSort(lefthead);
        Node newRight = mergeSort(rightHead);
        
        //merge
        return merge(newLeft,newRight);

    }
    public static void printLL(){
        if(head == null){
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void add(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void main(String args[]){
        mergeSortLL ll = new mergeSortLL();
        ll.add(5);
        ll.add(2);
        ll.add(4);
        ll.add(10);
        ll.add(1);
        ll.add(6);
        ll.add(9);
        printLL();
        ll.head=ll.mergeSort(ll.head);
        printLL();
    }
}
