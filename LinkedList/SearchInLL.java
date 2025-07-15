public class SearchInLL {
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


    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;                
            return;
        }
        
        newNode.next = head;
        size++;
        head = newNode;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int search(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int indx = helper(head.next, key);
        if(indx == -1){
            return -1;
        }
        return indx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }
    public static void main(String args[]){
        SearchInLL ll = new SearchInLL();
        ll.addFirst(20);        
        ll.addFirst(10);        
        ll.addFirst(30);       
        ll.addFirst(40);
        ll.printList();

        // System.out.println(ll.search(20));
        // System.out.println(ll.search(2));
        System.out.println(ll.recSearch(20));
        System.out.println(ll.recSearch(2));
        
    }

}
