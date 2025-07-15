public class RemoveNthNode {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;
    int size;

    public void add(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteNthRow(int n) {
        if (head == null) return;

        // Find size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        int iToFind = sz - n;
        if (iToFind == 0) {
            head = head.next;
            return;
        }

        Node prev = head;
        for (int i = 1; i < iToFind; i++) {
            prev = prev.next;
        }
        if (prev.next != null) {
            prev.next = prev.next.next;
        }
    }

    public static void main(String args[]) {
        RemoveNthNode ll = new RemoveNthNode();
        ll.add(4);
        ll.add(8);
        ll.add(9);
        ll.add(15);
        ll.add(18);
        ll.printLL();
        ll.deleteNthRow(5);
        ll.printLL();
    }
}
