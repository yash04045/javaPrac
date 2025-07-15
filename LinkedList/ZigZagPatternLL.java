public class ZigZagPatternLL{

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    static Node tail;
    public static void add(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    public static void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node getZigZag(){
        if(head == null || head.next == null){
            return head;
        }
        Node midNode = getMid(head);

        Node prev = null;
        Node curr = midNode.next;
        midNode.next = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }


        Node lefthead = head;
        Node righthead = prev;

        while(lefthead != null && righthead != null){
            Node nextL = lefthead.next;
            Node nextR = righthead.next;
            lefthead.next = righthead;           
            righthead.next = nextL;     
            lefthead = nextL;
            righthead = nextR;            
        }
        return head;
    } 
    public static void main(String[] args){
        ZigZagPatternLL ll = new ZigZagPatternLL();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);       
        ll.add(5);
        ll.add(6);
        printLL();
        head = ll.getZigZag();
        printLL();
    }
}
