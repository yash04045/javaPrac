

public class CheckPalindrome {
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

    public static void add(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;

    }
    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    //Slow fast approach for both even and odd Node of linked List
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow=slow.next; // jumps by 1
            fast=fast.next.next; // jumps by 2
        }
        return slow; // slow gives the midPoint of the linked List
    }

    public boolean Palindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //step 1 - find mid
        Node midPoint = findMid(head);
        
        //step 2 - reverse 2nd half
        Node prev = null;
        Node curr = midPoint;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; //right half head
        Node left = head; //left half head
        //step 3 - check left half and right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args){
        CheckPalindrome ll = new CheckPalindrome();
        ll.add(1);
        ll.add(2);
        ll.add(2);
        ll.add(2);
        ll.add(0);
        ll.printLL();
        System.out.println(ll.Palindrome());
    }


    
}
