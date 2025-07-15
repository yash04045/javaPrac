public class CyclicDetection {
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
    public static void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static boolean isCyclic(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCyclic(){

        //step 1: detect cyclic or not.
        Node slow = head;
        Node fast = head;
        boolean exist = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                exist = true;
                break;
            }
        }
        if(exist == false){
            return;
        }
        /// Remove cyclic 
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;            
        }
        prev.next = null;
        
    }
    public static void main(String[] args){
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        // Make the last node point back to head (cycle starts at head)
        head.next.next.next = temp;
        
        System.out.println(isCyclic());
        removeCyclic();
        System.out.println(isCyclic());
        printLL();
    }
}
